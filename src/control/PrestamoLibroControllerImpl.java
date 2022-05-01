package control;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
	public boolean devolverLibro(Long idSocio, String referenciaLibro) {
		/*
		 *necesito num socio y num referencia, para buscar el prestamo pendiente
		 *Si el socio devuelve un prestamo que esta dentro del plazo la operacion es correcta, si esta fuera de plazo
		 *se debe avisar de la circunstancia
		*/
		boolean isPlazoVencido = false;
		if(socioRepository.exists(idSocio)&&libroRepositry.exists(referenciaLibro)) {
			if(libroRepositry.isDisponible(referenciaLibro)==false) {
				isPlazoVencido = socioRepository.findSocioByID(idSocio).comprobarPrestamosVencidos();
			}
		}
		if(isPlazoVencido==true) {
			System.out.println("La devolucion del libro esta fuera de plazo");
		} else {
			System.out.println("La devolucion se ha hecho correctamente");
		}
		
		return isPlazoVencido;
	}
	
}
