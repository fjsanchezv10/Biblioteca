package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import control.PrestamoLibroController;
import control.PrestamoLibroControllerImpl;

class PrestamoLibroControllerImplTest {
	
	PrestamoLibroController instance;
	
	@BeforeEach
	void beforeEach() {
		 instance = new PrestamoLibroControllerImpl(null, null);
	}
	
	@Test
	void testDevolverLibro() {
		//case 1:
		boolean esperado = false;
		boolean real = instance.devolverLibro(null, null);
		
	}

}
