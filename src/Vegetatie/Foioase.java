package Vegetatie;

import Interaces.iPlante;
import abstractClass.arbori;

/**
 * Created by IulianC on 29/10/2014.
 */
public class Foioase extends arbori implements iPlante {
    boolean cuFructComestibil;

    /**
     * @param
     * @param formaFrunza   : eliptica, ovala, circulara, etc.
     * @param categInaltime : mic, mediu, mare
     * @param sol           : brune de padure, aluviale, de padure, cenusii, etc.
     * @param nume          : tei, mar, par, etc.
     * @param cFC           : true/false
     */
    public Foioase(String formaFrunza, String categInaltime, String sol, String nume, boolean cFC) {
        super(formaFrunza, categInaltime, sol, nume);

        this.cuFructComestibil = cFC;
    }

    /**
     * afiseaza detalii despre un foios
     */
    public String printDetails(){
        return "Nume: "+this.getmNume()+"\nArbore cu fructe comestibile: "+cuFructComestibil+"\n";
    }

    @Override
    public boolean leCadToamnaFrunzele() {
        return true;
    }

    @Override
    public boolean fructComestibil() {
        if(this.cuFructComestibil==false)
            return false;
        else
            return true;
    }
}
