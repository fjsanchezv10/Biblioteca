package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import modelo.Libro;
import objectMother.LibroMother;
import repositories.LibroRepositoryImplOM;
import repositories.LibroRepositry;

class LibroRepositryTest {

	@Test
	void testFindLibroByReferencia() {
		LibroRepositry libros=new LibroRepositoryImplOM();
		List<Libro> libros2 = LibroMother.getLibros();
		assertEquals(libros2.get(0),libros.findLibroByReferencia(libros2.get(0).getReferencia()));
		assertNull(libros.findLibroByReferencia("imposible"));
	}

}
