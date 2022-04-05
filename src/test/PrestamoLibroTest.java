package test;

import java.util.List;

import org.junit.jupiter.api.Test;

import control.PrestamoLibroController;
import modelo.Socio;
import objectMother.SocioMother;

class PrestamoLibroTest {

	private PrestamoLibroController prestamos;
	@Test
	void testPrestarLibro() {
		List<Socio> socios = SocioMother.getSocios();
		//List<Libro> libros=LibrosMother.getLibros();
		assertTrue(prestamos.prestarLibro(socios.get(0).getNombre(), libros.get(0).getReferencia()));
		assertFalse(prestamos.prestarLibro(socios.get(1).getNombre(), libros.get(0).getReferencia()));
		assertTrue(prestamos.prestarLibro(socios.get(0).getNombre(), libros.get(1).getReferencia()));
		assertFalse(prestamos.prestarLibro(socios.get(0).getNombre(), libros.get(2).getReferencia()));
	}

}
