package control;

import java.util.List;

import modelo.Socio;
import repositories.SocioRepository;

public class ListadoSociosPrestamosVencidosControllerImp implements ListadoSociosPrestamosVencidosController {
	private SocioRepository socioRepository;
	
	public ListadoSociosPrestamosVencidosControllerImp(SocioRepository socioRepository) {
		super();
		this.socioRepository = socioRepository;
	}

	@Override
	public List<Socio> consultarPrestamosVencidos() {
		return socioRepository.listarSociosVencidos();
	}

}
