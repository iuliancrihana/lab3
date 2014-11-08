/**
 * 
 */
package Magazin.Articol;

/**
 * @author IulianC
 *
 */
public abstract class Articol {
	protected String numeArticol;
	protected String culoareArticol;
	protected float pretArticol;
	protected int nrArticol;
	protected int idArticol;

	/**
	 * @return the nrArticol
	 */
	public int getNrArticol() {
		return nrArticol;
	}

	/**
	 * @return the numeArticol
	 */
	public String getNumeArticol() {
		return numeArticol;
	}

	/**
	 * @param numeArticol
	 *            the numeArticol to set
	 */
	public void setNumeArticol(String numeArticol) {
		this.numeArticol = numeArticol;
	}

	/**
	 * @return the pretArticol
	 */
	public float getPretArticol() {
		return pretArticol;
	}

	/**
	 * @return the idArticol
	 */
	public int getIdArticol() {
		return idArticol;
	}

	/**
	 * @param pretArticol
	 *            the pretArticol to set
	 */
	public void setPretArticol(float pretArticol) {
		this.pretArticol = pretArticol;
	}

	/**
	 * @param idArticol
	 *            the idArticol to set
	 */
	public void setIdArticol(int idArticol) {
		this.idArticol = idArticol;
	}

	/**
	 * @param nrArticol
	 *            the nrArticol to set
	 */
	public void setNrArticol(int nrArticol) {
		this.nrArticol = nrArticol;
	}

	/**
	 * @param culoareArticol
	 *            ce culoare are articolul
	 * @param numeArticol
	 *            cum se numeste articolul
	 * @param pretArticol
	 *            ce pret are articolul
	 */
	public Articol(String culoareArticol, String numeArticol,
			float pretArticol, int nrArticol, int idArticol) {
		this.culoareArticol = culoareArticol;
		this.numeArticol = numeArticol;
		this.pretArticol = pretArticol;
		this.nrArticol = nrArticol;
		this.idArticol = idArticol;
	}

	public Articol() {
	}

	public abstract void printArticol();

	public float pretRedus(String procentRedus) {
		String[] parts = procentRedus.split("%");
		return this.pretArticol-(this.pretArticol / 100)
				* Integer.parseInt(parts[0]);
	}

}
