package nl.hu.project4.v3.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Opdracht implements Serializable {
    private double Tijd;
    private String omschrijving;
    private String naam;

    public Opdracht(double gt, String om, String nm) {
        this.Tijd = gt;
        this.omschrijving = om;
        this.naam = nm;
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
        this.Tijd = Tijd;

    }
}