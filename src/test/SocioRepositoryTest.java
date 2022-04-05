package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.jupiter.api.Test;

import modelo.Socio;
import objectMother.SocioMother;
import repositories.SocioRepository;
import repositories.SocioRepositoryImpl;
import repositories.SocioRepositoryImplOM;

class SocioRepositoryTest {

	@Test
	void testFindSocioByName() {
		SocioRepository socioRepository=new SocioRepositoryImplOM();
		List<Socio> socios = SocioMother.getSocios();
		Socio socio = socios.get(0);
		Socio findSocioByName = socioRepository.findSocioByName(socio.getNombre());
		assertEquals(socio,findSocioByName);
		assertNull(socioRepository.findSocioByName("Felipondio"));
	}

}
