package nl.hu.blok4.v2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Opdracht {
    private static List<Opdracht> alleOpdrachten = new ArrayList<>();
    private double Tijd;

    private String omschrijving;
    private String naam;

    public Opdracht(double gt, String om, String nm) {
        this.Tijd =gt;
//        this.eindTijd = et;
        this.omschrijving = om;
        this.naam = nm;
        alleOpdrachten.add(this);
    }
    public Opdracht() {

    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public double getTijd() {
        return Tijd;
    }

    public void setTijd(double Tijd) {
//        if(beginTijd.before(eindTijd)) {
        this.Tijd = Tijd;
//        }
//        if (!beginTijd.before(eindTijd) || beginTijd.equals(eindTijd)) {
//            System.out.println("niet mogelijk");
//        }
    }
//
//    public Date getEindTijd() {
//        return eindTijd;
//    }

//    public void setEindTijd(Date eindTijd) {
//        if(beginTijd.before(eindTijd)) {
//            this.eindTijd = eindTijd;
//        }
//        if (!beginTijd.before(eindTijd) || beginTijd.equals(eindTijd)) {
//            System.out.println("niet mogelijk");
//        }

//    }
    public static List<Opdracht> getAlleActiviteiten() {
        return alleOpdrachten;
    }
}
