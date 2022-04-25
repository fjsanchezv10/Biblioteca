package repositories;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import modelo.Libro;
import modelo.Prestamo;
import modelo.Socio;
import modelo.response.SocioResponse;
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
	@Override
	public String getNombreSocioMasActivo() {
		HashMap<Long, Integer> listadoPrestamos=new HashMap<>();
		Collection<Integer> values = listadoPrestamos.values();
		ArrayList<Integer> lista=new ArrayList<>(values);
		Collections.sort(lista);
		return null;
	}
	@Override
	public List<SocioResponse> buscarSociosMasActivos() {
		LinkedList<SocioResponse> listaResponse=new LinkedList<>();
		for (Socio socio : socios) {
			listaResponse.add(socio.getSocioResponse());
		}
		//hay que ordenarlo y entregar los diez primeros
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
