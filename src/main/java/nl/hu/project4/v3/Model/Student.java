package nl.hu.project4.v3.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Student implements Serializable {
    private static Student deStudent;
    private String naam;
    private String email;
    private String gebruikersnaam;
    private String wachtwoord;
    private String role;
    private List<Les> alleLessen = new ArrayList<>();
    private List<Opdracht> alleOpdrachten = new ArrayList<>();
    private List<Activiteit> alleActiviteiten = new ArrayList<>();

    public Student(String nm, String em, String gn, String ww, String role) {
        this.naam = nm;
        this.email = em;
        this.gebruikersnaam = gn;
        this.wachtwoord = ww;
        this.role = role;
    }

    public Student() {
    }

    public static Student getDeStudent() {
        return deStudent;
    }

    public static void setDeStudent(Student deStudent) {
        Student.deStudent = deStudent;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setEmail(String email) {
        for (Student t : Klas.getKlas().getAlleStudenten()) {
            if (t.getEmail().equals(email)) {
                System.out.println("Email bestaat al");
            }
            this.email = email;
        }
    }

    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public void setGebruikersnaam(String gebruikersnaam) {
        for (Student t : Klas.getKlas().getAlleStudenten()) {
            if (t.getGebruikersnaam().equals(gebruikersnaam)) {
                System.out.println("Gebruikersnaam al in gebruik");
            }
            this.gebruikersnaam = gebruikersnaam;
        }
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    public static String registerUser(String nm, String em, String gn, String ww) {
        boolean zelfdeUser = false;
        Klas k1 = Klas.getKlas();
        for (Student t : k1.getAlleStudenten()) {
            if (t.naam.equals(nm) && t.email.equals(em) && t.gebruikersnaam.equals(gn) && t.wachtwoord.equals(ww)) {
                zelfdeUser = true;
                break;
            }
        }
        if(!zelfdeUser) {
            Student y = new Student(nm, em, gn, ww, "gebruiker");
            k1.VoegStudentToe(y);
            return y.role;
        }
        return null;
    }

    public static String validateUser(String gn, String ww) {
        Klas k = Klas.getKlas();
        for (Student t : k.getAlleStudenten()) {
            if (t.gebruikersnaam.equals(gn) && t.wachtwoord.equals(ww)) {
                return t.role;
                }
        }
        return null;
    }
    public List<Les> getAlleLessen() {
        return alleLessen;
    }

    public List<Opdracht> getAlleOpdrachten() {
        return alleOpdrachten;
    }
    public List<Activiteit> getAlleActiviteiten() {
        return alleActiviteiten;
    }
}




