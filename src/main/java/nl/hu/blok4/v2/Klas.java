package nl.hu.blok4.v2;

import Persistence.StudentDao;
import Persistence.StudentPostgresDaoImpl;

import java.util.ArrayList;
import java.util.List;

public class Klas {
    private static Klas deKlas;
   // private static List<Student> alleStudenten = new ArrayList<>();
    private String naam;
    private Student student;
    private Activiteit activiteit;
    private Les les;
    private Opdracht opdracht;
    private StudentDao studentDoa = new StudentPostgresDaoImpl();

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

    public List<Student> getAlleStudenten() {
        return studentDoa.findAll();
    }

    public void VoegStudentToe(Student t) {
        for (Student g : studentDoa.findAll()) {
            if (!g.equals(t)) {
                studentDoa.findAll().add(t);
            }

        }
    }
}