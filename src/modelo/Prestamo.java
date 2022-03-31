package modelo;

import java.time.LocalDate;

public class Prestamo {
	private Long id;
	private LocalDate inicio;
	private LocalDate devolucion;
	private Libro libro;
	private static final int plazoPrestamoEnDias = 15;

	public Prestamo(Long id, LocalDate inicio, Libro libro) {
		super();
		setId(id);
		setInicio(inicio);
		setLibro(libro);
	}

	
	private Long getId() {
		return id;
	}


	private LocalDate getInicio() {
		return inicio;
	}


	private LocalDate getDevolucion() {
		return devolucion;
	}


	private Libro getLibro() {
		return libro;
	}


	private static int getPlazoprestamoendias() {
		return plazoPrestamoEnDias;
	}


	private void setId(Long id) {
		assert id>0;
		this.id = id;
	}

	private void setInicio(LocalDate inicio) {
		assert inicio!=null;
		this.inicio = inicio;
	}

	private void setDevolucion(LocalDate devolucion) {
		assert devolucion!=null;
		this.devolucion = devolucion;
	}

	private void setLibro(Libro libro) {
		assert libro!=null;
		this.libro = libro;
	}

}
