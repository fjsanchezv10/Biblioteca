package repositories;

import modelo.Libro;
import modelo.Socio;

public interface SocioRepository {
	public Socio findSocioByID(Long idSocio);

	public boolean exists(Long idSocio);

	public boolean comprobarLimitePrestamos(Long idSocio);

	public boolean prestarLibro(Socio socio, Libro libro);
}
