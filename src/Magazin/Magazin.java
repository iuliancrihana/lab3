/**
 * 
 */
package Magazin;

import java.awt.peer.SystemTrayPeer;
import java.util.ArrayList;

import Exceptions.StockException;
import Interaces.iStock;
import Magazin.Articol.Articol;

/**
 * @author IulianC
 *
 */
public class Magazin extends Articol implements iStock {

	private ArrayList<Articol> listaArticole;

	/**
	 * 
	 */
	public Magazin() {
		listaArticole = new ArrayList<Articol>();
	}

	@Override
	public int addItemStock(Articol nouArticol) {
		try {
			for (Articol articol : listaArticole) {
				if (articol.getIdArticol() == nouArticol.getIdArticol())
					throw new StockException(
							"Produsul are acelasi id cu unul deja existent");
			}
			listaArticole.add(nouArticol);
			return 1;
		} catch (StockException e) {
			return 0;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Interaces.iStock#removeFromStock()
	 */
	@Override
	public int removeFromStock(int idArticol) throws Exception {
		try {
			for (Articol articol : listaArticole) {
				if (articol.getIdArticol() == idArticol) {
					int newNrx = articol.getNrArticol();
					if (newNrx <= 0)
						throw new StockException(
								"Produsul nu se mai afla in stock");
					System.out.println("Am vandut unul din produse");
					newNrx = newNrx - 1;
					articol.setNrArticol(newNrx);
				}
			}
			return 1;
		} catch (StockException e) {

			return 0;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Articol.Articol#printArticol()
	 */
	@Override
	public void printArticol() {
		for (Articol articol : listaArticole) {
			articol.printArticol();
		}

	}

	public void printProdusRedus(String procent, int idArticol) {
		for (Articol articol : listaArticole) {
			if (articol.getIdArticol() == idArticol)
			{
				articol.printArticol();
				System.out.println(articol.pretRedus(procent));
			}
		}
	}

}
