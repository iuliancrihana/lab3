/**
 * 
 */
package Magazin.Articol;

/**
 * @author IulianC
 *
 */
public class Pix extends Articol {
	private String tipPasta;

	/*
	 * (non-Javadoc)
	 * 
	 * @see Articol.Articol#printArticol()
	 */
	/**
	 * @param culoareArticol
	 * @param tipPasta
	 *            gel, cerneala, pasta, rezerva
	 * @param pretArticol
	 */
	public Pix(String culoareArticol, String tipPasta, float pretArticol,
			int nrArticol, int idArticol) {
		super(culoareArticol, "Pix", pretArticol, nrArticol, idArticol);
		this.tipPasta = tipPasta;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the tipPasta
	 */
	public String getTipPasta() {
		return tipPasta;
	}

	/**
	 * @param tipPasta
	 *            the tipPasta to set
	 */
	public void setTipPasta(String tipPasta) {
		this.tipPasta = tipPasta;
	}

	@Override
	public void printArticol() {
		System.out
				.println("Pix cu:" + this.tipPasta + "\nCuloare Pix:"
						+ this.culoareArticol + "\nPret Pix:"
						+ this.pretArticol + "\n");

	}

}
