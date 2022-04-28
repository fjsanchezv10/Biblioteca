package control;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import modelo.Prestamo;
import modelo.Socio;
import repositories.LibroRepositry;
import repositories.SocioRepository;
import repositories.SocioRepositoryImplOM;

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


	@Override
	public boolean devolverLibro() {
		/*
		 *necesito num socio y num referencia, para buscar el prestamo pendiente
		 *puede haber otra forma de buscar: mediante el num de socio, y el sistema nos mostrara los prestamos pendientes,
		 *pudiendo seleccionar uno de ellos.
		 *Si el socio devuelve un prestamo que esta dentro del plazo la operacion es correcta, si esta fuera de plazo
		 *se debe avisar de la circunstancia
		*/
		Scanner entrada = new Scanner(System.in);
        String referencia;
        Long id = null;
        ArrayList<Socio> sociosVencidos = new ArrayList<>();
        Iterator<Socio> iter = sociosVencidos.iterator();
        int contador = 0;
        while(iter.hasNext()) {
            if(iter.next().getId()==id) {
                System.out.println(contador+". "+(iter.next().prestamosPendientes)+"\n");
                referencia = entrada.next();
                if(libroRepositry.findLibroByReferencia(referencia).isDisponible()==false) {
                	System.out.println("El libro no ha sido devuelto aun");
                	return false;
                }else {
                	return true;
                }
            }
        }
		return false;
	}
	
}
