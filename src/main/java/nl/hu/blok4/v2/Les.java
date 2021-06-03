package nl.hu.blok4.v2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Les {
    private static List<Les> alleLessen = new ArrayList<>();
    private String naam;
    private double Tijd;



    public Les(String nm, double bt) {
        this.naam = nm;
        this.Tijd = bt;
        alleLessen.add(this);
    }
    public Les()
    {
    }
    public void setNaam(String naam) {
        this.naam = naam;
    }
    public void setTijd(double bt) {
//        if(beginTijd.before(eindTijd)) {
        this.Tijd = bt;
//        }
//        if (!beginTijd.before(eindTijd) || beginTijd.equals(eindTijd)) {
//            System.out.println("niet mogelijk");
//        }
    }
//    public void setEindTijd(Date et) {
//        if(beginTijd.before(eindTijd)) {
//            this.eindTijd = et;
//        }
//        if (!beginTijd.before(eindTijd) || beginTijd.equals(eindTijd)) {
//            System.out.println("niet mogelijk");
//        }


    public String getNaam() {
        return naam;
    }
    public double getTijd() {
        return Tijd;
    }
//    public Date getEindTijd() {
//        return eindTijd;
//    }
    public static List<Les> getAlleLessen() {
        return alleLessen;
    }
}
