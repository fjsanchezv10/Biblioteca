package repositories;

import java.util.ArrayList;
import java.util.List;

import modelo.Libro;
import modelo.Socio;
import modelo.response.SocioResponse;
import objectMother.SocioMother;

public class SocioRepositoryImpl implements SocioRepository {

	List<Socio> socios=new ArrayList<Socio>();

	@Override
	public Socio findSocioByID(Long idSocio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Long idSocio) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean comprobarLimitePrestamos(Long idSocio) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean prestarLibro(Socio socio, Libro libro) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Socio> listarSociosVencidos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNombreSocioMasActivo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SocioResponse> buscarSociosMasActivos() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
