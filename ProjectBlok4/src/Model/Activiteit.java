package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Activiteit {
    private static List<Activiteit> alleActiviteiten = new ArrayList<>();
    private Date beginTijd;
    private Date eindTijd;
    private String omschrijving;
    private String naam;

    public Activiteit(Date gt, Date et, String om, String nm) {
        this.beginTijd =gt;
        this.eindTijd = et;
        this.omschrijving = om;
        this.naam = nm;
        alleActiviteiten.add(this);
    }
    public Activiteit() {

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

    public Date getBeginTijd() {
        return beginTijd;
    }

    public void setBeginTijd(Date beginTijd) {
        if(beginTijd.before(eindTijd)) {
            this.beginTijd = beginTijd;
        }
        if (!beginTijd.before(eindTijd) || beginTijd.equals(eindTijd)) {
            System.out.println("niet mogelijk");
        }
    }

    public Date getEindTijd() {
        return eindTijd;
    }

    public void setEindTijd(Date eindTijd) {
        if(beginTijd.before(eindTijd)) {
            this.eindTijd = eindTijd;
        }
        if (!beginTijd.before(eindTijd) || beginTijd.equals(eindTijd)) {
            System.out.println("niet mogelijk");
        }

    }
    public static List<Activiteit> getAlleActiviteiten() {
        return alleActiviteiten;
    }
}
