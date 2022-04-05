package repositories;

import modelo.Libro;

public interface LibroRepositry {
	public Libro findLibroByReferencia(String referencia);
}
