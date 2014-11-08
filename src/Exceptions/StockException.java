package Exceptions;

/**
 * Created by IulianC on 29/10/2014.
 */
public class StockException extends Exception {

	/**
	 * in cazul in care incercam sa golim un stock gol
	 */
	public StockException(String message) {
		super(message);
		System.out.println(this.getMessage());
	}

}
