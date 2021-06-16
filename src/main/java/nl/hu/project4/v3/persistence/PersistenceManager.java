package nl.hu.project4.v3.persistence;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobContainerClientBuilder;
import nl.hu.project4.v3.Model.Klas;


import java.io.*;

public class PersistenceManager {
    private final static String ENDPOINT = "https://projectblok4opslag.blob.core.windows.net/";
    private final static String SASTOKEN = "?sv=2020-02-10&ss=bfqt&srt=sco&sp=rwdlacuptfx&se=2021-06-30T20:05:48Z&st=2021-06-14T12:05:48Z&spr=https&sig=KvJcedFUob%2BpOklrIGW07NTbNRh53yzyH2MK4htN8N0%3D";
    private final static String CONTAINER = "bankcontainer";

    private static BlobContainerClient blobCointainer = new BlobContainerClientBuilder().endpoint(ENDPOINT).sasToken(SASTOKEN).containerName(CONTAINER).buildClient();

    public static void loadWorldFromAzure() throws IOException, ClassNotFoundException {
        if(blobCointainer.exists()) {
            BlobClient blob = blobCointainer.getBlobClient("blobContainer");
            if(blob.exists()) {
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                blob.download(baos);

                ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
                ObjectInputStream ois = new ObjectInputStream(bais);

                Klas loadedWorld = (Klas) ois.readObject();
                Klas.setKlas(loadedWorld);
                baos.close();
                bais.close();
            }
        }
    }
    public static void saveWorldToAzure() throws IOException {
        if (!blobCointainer.exists()) {
            blobCointainer.create();
        }
        BlobClient blob = blobCointainer.getBlobClient("blobContainer");
        Klas worldToSave = Klas.getKlas();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(worldToSave);
        byte[] bytez = baos.toByteArray();

        ByteArrayInputStream bais = new ByteArrayInputStream(bytez);
        blob.upload(bais, bytez.length, true);
        baos.close();
        bais.close();
    }
}
