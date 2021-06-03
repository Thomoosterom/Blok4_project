package nl.hu.blok4.v2;

public class Student {
    private static Student deStudent;
    private String naam;
    private String email;
    private String gebruikersnaam;
    private String wachtwoord;

    public Student(String nm, String em, String gn, String ww) {
        this.naam = nm;
        this.email = em;
        this.gebruikersnaam = gn;
        this.wachtwoord = ww;
    }
    public Student() {
    }

    public static void setDeStudent(Student student){ deStudent = student;}

    public static Student getDeStudent(){ return deStudent;}

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        for(Student t : Klas.getKlas().getAlleStudenten()) {
            if(t.getEmail().equals(email)) {
                System.out.println("Email bestaat al");
            }
            this.email = email;
        }
    }

    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public void setGebruikersnaam(String gebruikersnaam) {
        for(Student t : Klas.getKlas().getAlleStudenten()) {
            if(t.getGebruikersnaam().equals(gebruikersnaam)){
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


    }


