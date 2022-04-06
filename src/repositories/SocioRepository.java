package repositories;

import modelo.Socio;

public interface SocioRepository {
	public Socio findSocioByName(String nombre);

	public boolean exists(String nombreSocio);

	public boolean comprobarLimitePrestamos(String nombreSocio);
}
