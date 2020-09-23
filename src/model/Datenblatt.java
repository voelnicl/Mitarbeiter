package model;

public class Datenblatt {

    private String name;
    private String geburtstag;
    private String adresse;
    private String firma;
    private String email;
    private String telefonr;
    private double gehalt;
    private int ident;

    public Datenblatt(String name, String geburtstag, String adresse, String firma, String email, String telefonr, double gehalt, int ident) {
        this.name = name;
        this.geburtstag = geburtstag;
        this.adresse = adresse;
        this.firma = firma;
        this.email = email;
        this.telefonr = telefonr;
        this.gehalt = gehalt;
        this.ident = ident;
    }

    public String getName() {
        return name;
    }

    public String getGeburtstag() {
        return geburtstag;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getFirma() {
        return firma;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefonr() {
        return telefonr;
    }

    public double getGehalt() {
        return gehalt;
    }

    public int getIdent() {
        return ident;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGeburtstag(String geburtstag) {
        this.geburtstag = geburtstag;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefonr(String telefonr) {
        this.telefonr = telefonr;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }
}
