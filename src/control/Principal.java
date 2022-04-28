package control;

import repositories.LibroRepositoryImplOM;
import repositories.LibroRepositry;
import repositories.SocioRepository;
import repositories.SocioRepositoryImpl;
import repositories.SocioRepositoryImplOM;

public class Principal {

	public static void main(String[] args) {
//		SocioRepository socioRepository=new SocioRepositoryImplOM();
//		LibroRepositry libroRepositry=new LibroRepositoryImplOM();
//		PrestamoLibroControllerImpl prestamoLibro=new PrestamoLibroControllerImpl(socioRepository, libroRepositry);
//		ListadoSociosPrestamosVencidosControllerImp listadoSociosVencidos=new ListadoSociosPrestamosVencidosControllerImp(socioRepository)	;	
		PrestamoLibroControllerImpl impl = new PrestamoLibroControllerImpl(new SocioRepositoryImpl(), new LibroRepositoryImplOM());
		impl.devolverLibro();
	}

}
