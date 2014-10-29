package Vegetatie;

import Exceptions.FruitException;
import Interaces.iPlante;
import abstractClass.arbori;

/**
 * Created by IulianC on 29/10/2014.
 */
public class Conifere extends arbori implements iPlante {

    private boolean pomCraciun;

    /**
     * @param
     * @param categInaltime : mic, mediu, mare
     * @param sol           : brune de padure, aluviale, de padure, cenusii, etc.
     * @param nume          : brad, pin, molid, etc.
     * @param pC            : true/false
     */
    public Conifere(String categInaltime, String sol, String nume, boolean pC) {
        super("circulara", categInaltime, sol, nume);

        this.pomCraciun = pC;
    }

    /**
     * afisez detalii despre un conifer
     */
    public String printDetails(){
        return "Nume: "+this.getmNume()+"\nArbore pe car eil putem impodobi de craciun: "+this.pomCraciun+"\n";
    }

    @Override
    public boolean leCadToamnaFrunzele() {
        return false;
    }

    @Override
    public boolean fructComestibil() {
        try {
            throw new FruitException("coniferele niciodata nu au fructe comestibile");
        } catch (FruitException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean isPomCraciun() {
        return pomCraciun;
    }

    public void setPomCraciun(boolean pomCraciun) {
        this.pomCraciun = pomCraciun;
    }


}
