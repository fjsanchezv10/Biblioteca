package repositories;

import java.util.List;

import modelo.Socio;
import objectMother.SocioMother;

public class SocioRepositoryImpl implements SocioRepository {

	List<Socio> socios=SocioMother.getSocios();
	
	@Override
	public Socio findSocioByName(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

}
