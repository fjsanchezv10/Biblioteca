package repositories;

import java.util.List;

import modelo.Socio;
import objectMother.SocioMother;

public class SocioRepositoryImplOM implements SocioRepository {

	List<Socio> socios=SocioMother.getSocios();
	@Override
	public Socio findSocioByName(String nombre) {
		int index = 0;
		while (socios.size() > index) {
			Socio socio = socios.get(index++);
			if(socio.getNombre().equals(nombre)) {
				return socio;
			}
		}
		return null;
	}

}
