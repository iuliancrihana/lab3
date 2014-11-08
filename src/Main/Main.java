package Main;

/**
 * 
 */
import Magazin.Magazin;
import Magazin.Articol.Caiet;
import Magazin.Articol.Pix;

/**
 * @author IulianC
 *
 */
public class Main {

	public static void main(String[] args) {
		Magazin testMagazin=new Magazin();
		testMagazin.addItemStock(new Caiet("Albastru", (float) 10.4, "disctando", 10, 1));
		testMagazin.addItemStock(new Pix("Verde", "gel", 2, 1, 2));
		testMagazin.printProdusRedus("20%", 1);
		testMagazin.printArticol();
		try {
			testMagazin.removeFromStock(2);
			testMagazin.removeFromStock(2);
		} catch (Exception e) {
			
			
		}
		


	}

}
