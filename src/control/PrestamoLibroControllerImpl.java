package control;

import modelo.Libro;
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
	public boolean prestarLibro(String nombreSocio, String referenciaLibro) {
		if(socioRepository.exists(nombreSocio)&&libroRepositry.exists(referenciaLibro)) {
			if(libroRepositry.isDisponible(referenciaLibro)) {
				if(socioRepository.comprobarLimitePrestamos(nombreSocio)) {
					
				}
			}
		}
		return false;
	}
	
}
