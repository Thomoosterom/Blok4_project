package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Les {
    private static List<Les> alleLessen = new ArrayList<>();
    private String naam;
    private Date beginTijd;
    private Date eindTijd;


    public Les(String nm,Date bt, Date et) {
        this.naam = nm;
        this.beginTijd = bt;
        this.eindTijd = et;
        alleLessen.add(this);
    }
    public Les()
    {
    }
    public void setNaam(String naam) {
        this.naam = naam;
    }
    public void setBeginTijd(Date bt) {
        if(beginTijd.before(eindTijd)) {
            this.beginTijd = bt;
        }
        if (!beginTijd.before(eindTijd) || beginTijd.equals(eindTijd)) {
            System.out.println("niet mogelijk");
        }
    }
    public void setEindTijd(Date et) {
        if(beginTijd.before(eindTijd)) {
            this.eindTijd = et;
        }
        if (!beginTijd.before(eindTijd) || beginTijd.equals(eindTijd)) {
            System.out.println("niet mogelijk");
        }

    }
    public String getNaam() {
        return naam;
    }
    public Date getBeginTijd() {
        return beginTijd;
    }
    public Date getEindTijd() {
        return eindTijd;
    }
    public static List<Les> getAlleLessen() {
        return alleLessen;
    }
}
