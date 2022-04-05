package modelo;

public class Libro {
	private String ISBN;
	private String referencia;

	public Libro(String iSBN, String referencia) {
		super();
		ISBN = iSBN;
		this.referencia = referencia;
	}

	// Vamos a hacerlo despues en Libro
	private void setISBN(String iSBN) {
		assert Tools.isRightString(iSBN);
		ISBN = iSBN;
	}

	private void setReferencia(String referencia) {
		assert Tools.isRightString(referencia);
		this.referencia = referencia;
	}

	private String getISBN() {
		return ISBN;
	}

	private String getReferencia() {
		return referencia;
	}

}
