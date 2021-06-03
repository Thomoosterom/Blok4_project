package Model;

import nl.hu.blok4.v2.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    static Student l1;


    @BeforeEach
    public void initialize() {
        try {
            l1 = new Student("Thom", "thom.oosterom@student.hu.nl", "gebruikersnaam", "wachtwoord");

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
    @Test
    public void testUniekeGebruikersnaam_False() {
        String argumentNaam = l1.getNaam();
        Student student = new Student();
        try {
            student = new Student("Geen naam", "a", "b", "c");
           // student.setNaam(argumentNaam);
            String studentNaam = student.getNaam();
            System.out.println(student.getNaam());
            assertFalse(studentNaam.equals(argumentNaam));
        } catch (IllegalArgumentException e) {
            if (student != null) {
                String klasNaam = student.getNaam();
                assertFalse(klasNaam.equals(argumentNaam));
            }
        }
    }
    @Test
    public void testUniekeGebruikersnaam_True() {
        String argumentNaam = "StudentNaam1";
        Student student = null;
        try{
            student = new Student();
            student.setNaam(argumentNaam);
            String KlasNaam = student.getNaam();
            assertTrue(KlasNaam.equals(argumentNaam));
        } catch (IllegalArgumentException e) {
            if(student!=null) {
                String KlasNaam = student.getNaam();
                assertTrue(KlasNaam.equals(argumentNaam));
            }
        }
    }

}