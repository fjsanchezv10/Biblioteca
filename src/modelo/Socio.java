package modelo;

import java.util.ArrayList;

public class Socio {

	private Long id;
	private String nombre;
	private String datosPersonales;
	private ArrayList<Prestamo> prestamosPendientes;
	private ArrayList<Prestamo> prestamosDevueltos;
	private static final int maximosPrestamosPendientes=2;

	public Socio(Long id, String nombre, String datosPersonale) {
		super();
		setId(id);
		setNombre(nombre);
		setDatosPersonales(datosPersonales);
		//expresando la composicion que aplicamos en el dc
		setPrestamosPendientes(new ArrayList<Prestamo>());
		setPrestamosDevueltos(new ArrayList<Prestamo>());
	}

	private Long getId() {
		return id;
	}

	private void setId(Long id) {
		assert id > 0;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		assert Tools.isWrongString(nombre);
		this.nombre = nombre;
	}

	private String getDatosPersonales() {
		return datosPersonales;
	}

	private void setDatosPersonales(String datosPersonales) {
		assert Tools.isWrongString(datosPersonales);
		this.datosPersonales = datosPersonales;
	}

	private ArrayList<Prestamo> getPrestamosPendientes() {
		return prestamosPendientes;
	}

	private void setPrestamosPendientes(ArrayList<Prestamo> prestamosPendientes) {
		assert prestamosPendientes != null;
		this.prestamosPendientes = prestamosPendientes;
	}

	private ArrayList<Prestamo> getPrestamosDevueltos() {
		return prestamosDevueltos;
	}

	private void setPrestamosDevueltos(ArrayList<Prestamo> prestamosDevueltos) {
		assert prestamosDevueltos != null;
		this.prestamosDevueltos = prestamosDevueltos;
	}

}
