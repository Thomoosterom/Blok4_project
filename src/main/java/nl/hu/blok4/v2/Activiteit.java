package nl.hu.blok4.v2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Activiteit {
    private static List<Activiteit> alleActiviteiten = new ArrayList<>();
    private double Tijd;
    private String omschrijving;
    private int activiteitNr;
    private String naam;

    public Activiteit(double gt, String om, int nr, String nm) {
        this.Tijd =gt;
        this.omschrijving = om;
        this.naam = nm;
        this.activiteitNr = nr;
        alleActiviteiten.add(this);
    }
    public Activiteit() {

    }
    public int getActiviteitNr() {
        return activiteitNr;
    }
    public void setActiviteitsNr(int nr) {
        this.activiteitNr = nr;
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

    public void setTijd(double bTijd) {
//        if(beginTijd.before(eindTijd)) {
            this.Tijd = bTijd;
//        }
//        if (!beginTijd.before(eindTijd) || beginTijd.equals(eindTijd)) {
//            System.out.println("niet mogelijk");
//        }
    }

//    public Date getEindTijd() {
//        return eindTijd;
//    }
//
//    public void setEindTijd(Date eindTijd) {
//        if(beginTijd.before(eindTijd)) {
//            this.eindTijd = eindTijd;
//        }
//        if (!beginTijd.before(eindTijd) || beginTijd.equals(eindTijd)) {
//            System.out.println("niet mogelijk");
//        }


    public static List<Activiteit> getAlleActiviteiten() {
        return alleActiviteiten;
    }
}
