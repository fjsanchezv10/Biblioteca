package repositories;

import java.util.List;

import modelo.Libro;
import modelo.Socio;
import objectMother.LibroMother;

public class LibroRepositoryImplOM implements LibroRepositry{

	List<Libro> libros=LibroMother.getLibros();
	
	@Override
	public Libro findLibroByReferencia(String referencia) {
		int index = 0;
		while (libros.size() > index) {
			Libro libro = libros.get(index++);
			if(libro.getReferencia().equals(referencia)) {
				return libro;
			}
		}
		return null;
	}

	@Override
	public boolean exists(String referenciaLibro) {
		return findLibroByReferencia(referenciaLibro)!=null;
	}

	@Override
	public boolean isDisponible(String referenciaLibro) {
		return findLibroByReferencia(referenciaLibro).isDisponible();
	}

}
