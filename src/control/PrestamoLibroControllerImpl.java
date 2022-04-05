package control;

import repositories.SocioRepository;

public class PrestamoLibroControllerImpl implements PrestamoLibroController {
	private SocioRepository socioRepository;

	public PrestamoLibroControllerImpl(SocioRepository socioRepository) {
		super();
		this.socioRepository = socioRepository;
	}

	@Override
	public boolean prestarLibro(String nombreSocio, String referenciaLibro) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
