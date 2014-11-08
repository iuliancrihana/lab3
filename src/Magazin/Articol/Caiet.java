/**
 * 
 */
package Magazin.Articol;

/**
 * @author IulianC
 *
 */
public class Caiet extends Articol {
	private String tipCaiet;

	/**
	 * @param culoareArticol
	 *            culoare caiet
	 * @param pretArticol
	 *            pret caiet
	 * @param tipCaiet
	 *            dictando, matematica
	 * @param nrArticol
	 *            cate articole am cumparat initial
	 */
	public Caiet(String culoareArticol, float pretArticol, String tipCaiet,
			int nrArticol, int idArticol) {
		super(culoareArticol, "Caiet", pretArticol, nrArticol, idArticol);
		this.tipCaiet = tipCaiet;
	}

	/**
	 * @return the tipCaiet
	 */
	public String getTipCaiet() {
		return tipCaiet;
	}

	/**
	 * @param tipCaiet
	 *            the tipCaiet to set
	 */
	public void setTipCaiet(String tipCaiet) {
		this.tipCaiet = tipCaiet;
	}

	/*
	 * Afiseaza date despre caiet
	 */
	@Override
	public void printArticol() {
		System.out.println("Tip Caiet:" + this.tipCaiet + "\nCuloare Caiet:"
				+ this.culoareArticol + "\nPret Caiet:" + this.pretArticol
				+ "\n");
	}

}
