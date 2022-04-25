package modelo;

import java.util.ArrayList;
import java.util.Iterator;

import modelo.response.SocioResponse;

public class Socio {

	private Long id;
	private String nombre;
	private String datosPersonales;
	public ArrayList<Prestamo> prestamosPendientes;
	private ArrayList<Prestamo> prestamosDevueltos;
	private static final int maximosPrestamosPendientes=2;

	public Socio(Long id, String nombre, String datosPersonales) {
		super();
		setId(id);
		setNombre(nombre);
		setDatosPersonales(datosPersonales);
		//expresando la composicion que aplicamos en el dc
		setPrestamosPendientes(new ArrayList<Prestamo>());
		setPrestamosDevueltos(new ArrayList<Prestamo>());
	}

	public Long getId() {
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
		assert Tools.isRightString(nombre);
		this.nombre = nombre;
	}

	private String getDatosPersonales() {
		return datosPersonales;
	}

	private void setDatosPersonales(String datosPersonales) {
		assert Tools.isRightString(datosPersonales);
		this.datosPersonales = datosPersonales;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Socio other = (Socio) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
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

	public boolean isLimitePrestamosNoDevueltosAlcanzados() {
		return prestamosPendientes.size()<maximosPrestamosPendientes;
	}

	public boolean crearNuevoPrestamo(Prestamo prestamo) {
		return this.prestamosPendientes.add(prestamo);
	}

	public Long getNewId() {
		return (long) (prestamosDevueltos.size()+prestamosPendientes.size())+1;
	}

	public boolean comprobarPrestamosVencidos() {
		boolean respuesta=false;
		Iterator<Prestamo> iterator = prestamosPendientes.iterator();
		while(iterator.hasNext()&&!respuesta) {
			Prestamo prestamo = iterator.next();
			respuesta=prestamo.isVencido();
		}
		return respuesta;
	}

	public SocioResponse getSocioResponse() {
		return new SocioResponse(this.nombre, this.prestamosDevueltos.size());
	}

}
