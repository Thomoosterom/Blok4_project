package Model;

import nl.hu.blok4.v2.Klas;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KlasTest {
    static Klas k1;


    @BeforeEach
    public void initialize() {
        try {
            k1 = new Klas("Test");
            Klas.setKlas(k1);

        } catch (Exception e) {
            String errorMessage = "Exception: " + e.getMessage();
            System.out.println(errorMessage);
        }
    }
    @Test
    public void testGeldigeNaam_False() {
        String argumentNaam = k1.getNaam();
        Klas klas = new Klas();
        try {
            klas = new Klas("KlasNaam");
            klas.setNaam(argumentNaam);
            String klasNaam = klas.getNaam();
            System.out.println(klas.getNaam());
            assertFalse(klasNaam.equals(argumentNaam));
        } catch (IllegalArgumentException e) {
            if (klas != null) {
                String klasNaam = klas.getNaam();
                assertFalse(klasNaam.equals(argumentNaam));
            }
        }
    }

    @Test
    public void testGeldigenNaam_True() {
        String argumentNaam = "KlasNaam1";
        Klas klas = null;
        try{
            klas = new Klas("naam");
            klas.setNaam(argumentNaam);
            String KlasNaam = klas.getNaam();
            assertTrue(KlasNaam.equals(argumentNaam));
        } catch (IllegalArgumentException e) {
            if(klas!=null) {
            String KlasNaam = klas.getNaam();
            assertTrue(KlasNaam.equals(argumentNaam));
        }
    }
    }
}