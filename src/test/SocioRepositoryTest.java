package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.jupiter.api.Test;

import modelo.Socio;
import objectMother.SocioMother;
import repositories.SocioRepository;
import repositories.SocioRepositoryImpl;

class SocioRepositoryTest {

	@Test
	void testFindSocioByName() {
		SocioRepository socioRepository=new SocioRepositoryImpl();
		List<Socio> socios = SocioMother.getSocios();
		assertEquals(socios.get(0),socioRepository.findSocioByName(socios.get(0).getNombre()));
		assertNull(socioRepository.findSocioByName("Felipondio"));
	}

}
