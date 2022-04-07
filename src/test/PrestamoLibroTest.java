package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import control.PrestamoLibroController;
import control.PrestamoLibroControllerImpl;
import modelo.Libro;
import modelo.Socio;
import objectMother.LibroMother;
import objectMother.SocioMother;
import repositories.LibroRepositoryImplOM;
import repositories.SocioRepositoryImplOM;

class PrestamoLibroTest {

	private PrestamoLibroController prestamos;
	@Test
	void testPrestarLibro() {
		List<Socio> socios = SocioMother.getSocios();
		List<Libro> libros=LibroMother.getLibros();
		prestamos=new PrestamoLibroControllerImpl(
				new SocioRepositoryImplOM(), new LibroRepositoryImplOM());
		assertTrue(prestamos.prestarLibro(socios.get(0).getId(), libros.get(0).getReferencia()));
		assertFalse(prestamos.prestarLibro(socios.get(1).getId(), libros.get(0).getReferencia()));
		assertTrue(prestamos.prestarLibro(socios.get(0).getId(), libros.get(1).getReferencia()));
		assertFalse(prestamos.prestarLibro(socios.get(0).getId(), libros.get(2).getReferencia()));
	}

}
