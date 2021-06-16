package nl.hu.project4.v3.Model;

import java.io.Serializable;

public class Les implements Serializable {
    private String naam;
    private double Tijd;


    public Les(String nm, double bt) {
        this.naam = nm;
        this.Tijd = bt;
    }

    public Les() {
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setTijd(double bt) {
        this.Tijd = bt;

    }
    public String getNaam() {
        return naam;
    }

    public double getTijd() {
        return Tijd;
    }

}
