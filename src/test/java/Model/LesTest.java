package Model;

import nl.hu.blok4.v2.Les;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class LesTest {
    static Les l1;

//
//    @BeforeEach
//    public void initialize() {
//        try {
//
//            Date e = new Date(11, Calendar.JUNE, 15, 3, 30);
//            Date r = new Date(11, Calendar.JUNE, 15, 5, 30);
//            l1 = new Les("Engels", e, r);
//        } catch (Exception e) {
//            String errorMessage = "Exception: " + e.getMessage();
//            System.out.println(errorMessage);
//        }
//    }
//
//    @Test
//    public void testBeginEnEindTijdMoetUniekZijn_False() {
//        Date d = l1.getBeginTijd();
//        Date e = l1.getEindTijd();
//        Les les = new Les("engels", e, d);
//        try {
//            les.setEindTijd(d);
//            les.setBeginTijd(e);
//            assertNotEquals(les.getBeginTijd(), d);
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







//    @Test
//    public void testDatumMoetGeldigZIjn_False() {
//
//        Date d = new Date(2019, 12, 55, 33, 3);
//        Les les = new Les();
//        Date datum = null;
//        try {
//            les.setBeginTijd(d); // Moet een exception geven
//            datum = les.getBeginTijd();
//            assertFalse(datum.equals(d));
//        }
//        catch(IllegalArgumentException e){
//            datum = les.getBeginTijd();
//            assertTrue(datum == null);
//        }
//    }
}

