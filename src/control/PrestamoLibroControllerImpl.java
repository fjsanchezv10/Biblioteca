package control;

import repositories.LibroRepositry;
import repositories.SocioRepository;

public class PrestamoLibroControllerImpl implements PrestamoLibroController {
	private SocioRepository socioRepository;
	private LibroRepositry libroRepositry;

	
	public PrestamoLibroControllerImpl(SocioRepository socioRepository, LibroRepositry libroRepositry) {
		super();
		this.socioRepository = socioRepository;
		this.libroRepositry = libroRepositry;
	}


	@Override
	public boolean prestarLibro(Long idSocio, String referenciaLibro) {
		if(socioRepository.exists(idSocio)&&libroRepositry.exists(referenciaLibro)) {
			if(libroRepositry.isDisponible(referenciaLibro)) {
				if(socioRepository.comprobarLimitePrestamos(idSocio)) {
					return socioRepository.prestarLibro(
							socioRepository.findSocioByID(idSocio),
							libroRepositry.findLibroByReferencia(referenciaLibro));
				}
			}
		}
		return false;
	}
	
}
