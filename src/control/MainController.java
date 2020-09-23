package control;

import model.*;
import view.*;

public class MainController {
    private Datenblatt[] datenblattA;
    private Datenblatt datenblatt;

    public MainController() {
        Datenblatt datenblattA = new Datenblatt("Günther Kastenfrosch", "24.01.1891", "Rudolfsstraße 10, 35623 Magdeburg", "Rudolf-Datenrettung", "günther.k@gmx.de", "+49213125678", 14, 1);
        datenblatt = datenblattA;
    }

    public String[] alleStringDaten() {
        String[] output;
        output = new String[6];
        output[0] = datenblatt.getName();
        output[1] = datenblatt.getGeburtstag();
        output[2] = datenblatt.getAdresse();
        output[3] = datenblatt.getTelefonr();
        output[4] = datenblatt.getEmail();
        output[5] = datenblatt.getFirma();
        return output;
    }

    public double getGehalt() {
        double gehalt = datenblatt.getGehalt();
        return gehalt;
    }

    public int getIdent() {
        int ident = datenblatt.getIdent();
        return ident;
    }

    public void setDatenblattAlleWerte(String[] output) {
        datenblatt.setName(output[0]);
        datenblatt.setGeburtstag(output[1]);
        datenblatt.setAdresse(output[2]);
        datenblatt.setTelefonr(output[3]);
        datenblatt.setEmail(output[4]);
        datenblatt.setFirma(output[5]);
    }

}

