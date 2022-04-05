package repositories;

import modelo.Socio;

public interface SocioRepository {
	public Socio findSocioByName(String nombre);
}
