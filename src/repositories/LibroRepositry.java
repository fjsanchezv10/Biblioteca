package repositories;

import modelo.Libro;

public interface LibroRepositry {
	public Libro findLibroByReferencia(String referencia);

	public boolean exists(String referenciaLibro);

	public boolean isDisponible(String referenciaLibro);
}
