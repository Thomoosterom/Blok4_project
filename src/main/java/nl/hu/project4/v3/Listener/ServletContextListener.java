package nl.hu.project4.v3.Listener;

import nl.hu.project4.v3.Model.Klas;
import nl.hu.project4.v3.Model.Student;
import nl.hu.project4.v3.persistence.PersistenceManager;
import reactor.core.scheduler.Schedulers;
import reactor.netty.http.HttpResources;
import javax.servlet.ServletContextEvent;
import javax.servlet.annotation.WebListener;
import java.io.IOException;
import java.time.Duration;

@WebListener
public class ServletContextListener implements javax.servlet.ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            PersistenceManager.loadWorldFromAzure();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        if(Klas.getKlas()==null) {
            System.out.println("applicatie is aan het opstarten");
            Klas k = new Klas("V1a");
            Klas.setKlas(k);
            Student k1 = new Student("Thom", "thom.oosterom@student.hu.nl","thomoosterom","test", "gebruiker");
            k.VoegStudentToe(k1);
            System.out.println(k1.getGebruikersnaam());
            System.out.println(k1.getWachtwoord());

        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("applicatie is aan het afsluiten");
        try {
            PersistenceManager.saveWorldToAzure();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Schedulers.shutdownNow();
        HttpResources.disposeLoopsAndConnectionsLater(Duration.ZERO,Duration.ZERO).block();


    }

}
