package repositories;

import java.util.ArrayList;
import java.util.List;

import modelo.Libro;
import modelo.Prestamo;
import modelo.Socio;
import objectMother.SocioMother;

public class SocioRepositoryImplOM implements SocioRepository {

	List<Socio> socios=SocioMother.getSocios();
	
	@Override
	public Socio findSocioByID(Long idSocio) {
		int index = 0;
		while (socios.size() > index) {
			Socio socio = socios.get(index++);
			if(socio.getId().equals(idSocio)) {
				return socio;
			}
		}
		return null;
	}
	@Override
	public boolean exists(Long idSocio) {
		return findSocioByID(idSocio)!=null;
	}
	@Override
	public boolean comprobarLimitePrestamos(Long idSocio) {
		return findSocioByID(idSocio).isLimitePrestamosNoDevueltosAlcanzados();
	}
	
	@Override
	public boolean prestarLibro(Socio socio, Libro libro) {
		boolean isPrestado = socio.crearNuevoPrestamo(new Prestamo(socio.getNewId(),libro));
		libro.setDisponible(!isPrestado);
		return isPrestado;
	}
	@Override
	public List<Socio> listarSociosVencidos() {
		ArrayList<Socio> pendientes=new ArrayList<>();
		for (Socio socio : socios) {
			if(socio.comprobarPrestamosVencidos()) {
				pendientes.add(socio);
			}
		}
		return pendientes;
	}
	

}
