package Model;

import java.util.ArrayList;
import java.util.List;

public class Klas {
    private static Klas deKlas;
    private static List<Student> alleStudenten = new ArrayList<>();
    private String naam;
    private Student student;
    private Activiteit activiteit;
    private Les les;

    public Klas(String nm) {
        this.naam = nm;
    }

    public Klas() {

    }

    public static void setKlas(Klas klas) {
        deKlas = klas;
    }

    public static Klas getKlas() {
        return deKlas;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String nm) {
        if(!Klas.getKlas().getNaam().equals(nm)) {
            if (nm != null) {
                this.naam = nm;
            }
        }
    }

    public static List<Student> getAlleStudenten() {
        return alleStudenten;
    }

    public void VoegStudentToe(Student t) {
        for (Student g : alleStudenten) {
            if (!g.equals(t)) {
                alleStudenten.add(t);
            }

        }
    }
}