package Model;

import nl.hu.blok4.v2.Activiteit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ActiviteitTest {
    static Activiteit l1;


    @BeforeEach
    public void initialize() {
        try {
//            Date e = new Date(11, Calendar.JUNE, 15, 3, 30);
//            Date r = new Date(11, Calendar.JUNE, 15, 5, 30);
            l1 = new Activiteit(3.5,"Leerling is naar de dokter", 1,"Dokter");
        } catch (Exception e) {
            String errorMessage = "Exception: " + e.getMessage();
            System.out.println(errorMessage);
        }
    }
//
//    @Test
//    public void testBeginEnEindTijdMoetUniekZijn_False() {
//        Date d = l1.getBeginTijd();
//        Date e = l1.getEindTijd();
//        Activiteit a = new Activiteit(d, e, "Leerling naar de dokter", "dokter");
//        try {
//            a.setEindTijd(d);
//            a.setBeginTijd(e);
//            assertFalse(a.getBeginTijd().equals(e));
//
//        } catch (IllegalArgumentException f) {
//            String errorMessage = "Exception: " + f.getMessage();
//            System.out.println(errorMessage);
//        }
//    }
//
//    @Test
//    public void testBeginTijdVoorEindTijd_True() {
//        Date d = l1.getBeginTijd();
//        Date e = l1.getEindTijd();
//        try{
//            assertTrue(d.before(e));
//        }catch (IllegalArgumentException f) {
//            String message = "Exception: " + f.getMessage();
//            System.out.println(message);
//        }
//    }
//    @Test
//    public void testBeginTijdVoorEindTijd_False() {
//        Date d = l1.getBeginTijd();
//        Date e = l1.getEindTijd();
//        try{
//            assertFalse(e.before(d));
//        }catch (IllegalArgumentException f) {
//            String message = "Exception: " + f.getMessage();
//            System.out.println(message);
//        }
//    }

}