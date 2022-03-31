package repositories;

import modelo.Libro;

public interface BookRepository {
	public Libro findBookByReference(String reference);
}
