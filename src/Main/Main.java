package Main;

import Vegetatie.Conifere;
import Vegetatie.Foioase;
import abstractClass.arbori;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IulianC on 29/10/2014.
 */
public class Main {
    public static void main(String[] args) {
        Conifere brad;
        brad = new Conifere("inalt", "cenusiu", "brad", true);

        Foioase tei;
        tei = new Foioase("inima", "inalt", "mediu", "tei", false);

        List<arbori> padure = new ArrayList<arbori>();
        padure.add(brad);
        padure.add(tei);

        for (arbori item : padure) {
            System.out.println(item.printDetails());
        }

        //brad.fructComestibil();
    }
}
