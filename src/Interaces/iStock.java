package Interaces;

import Magazin.Articol.Articol;

/**
 * Created by IulianC on 29/10/2014.
 */
public interface iStock {
	/**
	 * @param nouArticol
	 * @return
	 */
	int addItemStock(Articol nouArticol);

	/**
	 * @param idArticol
	 * @return
	 * @throws Exception
	 */
	int removeFromStock(int idArticol) throws Exception;
}
