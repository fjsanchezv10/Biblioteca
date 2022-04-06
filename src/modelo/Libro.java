package modelo;

public class Libro {
	private String ISBN;
	private String referencia;
	private boolean disponible=false;

	

	public Libro(String iSBN, String referencia) {
		super();
		ISBN = iSBN;
		this.referencia = referencia;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
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

	public String getReferencia() {
		return referencia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((referencia == null) ? 0 : referencia.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (referencia == null) {
			if (other.referencia != null)
				return false;
		} else if (!referencia.equals(other.referencia))
			return false;
		return true;
	}

}
