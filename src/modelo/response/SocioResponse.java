package modelo.response;

public class SocioResponse {

	private String nombre;
	private int prestamosCantidad;
	
	public SocioResponse(String nombre, int prestamosCantidad) {
		super();
		this.nombre = nombre;
		this.prestamosCantidad = prestamosCantidad;
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getPrestamosCantidad() {
		return prestamosCantidad;
	}

	@Override
	public String toString() {
		return nombre+" "+String.valueOf(prestamosCantidad);
	}
	
}
