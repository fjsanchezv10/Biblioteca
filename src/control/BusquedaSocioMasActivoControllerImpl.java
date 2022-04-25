package control;

import repositories.SocioRepository;

public class BusquedaSocioMasActivoControllerImpl implements BusquedaSocioMasActivoController {

	private SocioRepository socioRepository;
	
	public BusquedaSocioMasActivoControllerImpl(SocioRepository socioRepository) {
		super();
		this.socioRepository = socioRepository;
	}

	@Override
	public String buscarSocioMasActivo() {
		return socioRepository.getNombreSocioMasActivo();
	}

}
