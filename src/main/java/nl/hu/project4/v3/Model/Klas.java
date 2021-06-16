package nl.hu.project4.v3.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Klas implements Serializable {
    private static Klas deKlas;
    private List<Student> alleStudenten = new ArrayList<>();
    private String naam;
    private Student student;
    private Activiteit activiteit;
    private Les les;
    private Opdracht opdracht;

    public Klas(String nm) {
        this.naam = nm;
    }

//    public Klas() {
//
//    }

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
        if (!Klas.getKlas().getNaam().equals(nm)) {
            if (nm != null) {
                this.naam = nm;
            }
        }
    }

    public List<Student> getAlleStudenten() {
        return alleStudenten;
    }

    public void VoegStudentToe(Student t) {
        if (!alleStudenten.contains(t)) {
            alleStudenten.add(t);
        }
    }
}