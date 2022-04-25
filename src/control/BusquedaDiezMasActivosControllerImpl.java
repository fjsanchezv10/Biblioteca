package control;

import java.util.List;

import modelo.response.SocioResponse;
import repositories.SocioRepository;

public class BusquedaDiezMasActivosControllerImpl implements BusquedaDiezMasActivosController {
	private SocioRepository socioRepository;
	
	
	public BusquedaDiezMasActivosControllerImpl(SocioRepository socioRepository) {
		super();
		this.socioRepository = socioRepository;
	}


	@Override
	public List<SocioResponse> buscarDiezMasActivos() {
		return socioRepository.buscarSociosMasActivos();
	}

}
