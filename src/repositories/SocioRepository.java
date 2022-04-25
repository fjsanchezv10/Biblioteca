package repositories;

import java.util.List;

import modelo.Libro;
import modelo.Socio;
import modelo.response.SocioResponse;

public interface SocioRepository {
	public Socio findSocioByID(Long idSocio);

	public boolean exists(Long idSocio);

	public boolean comprobarLimitePrestamos(Long idSocio);

	public boolean prestarLibro(Socio socio, Libro libro);

	public List<Socio> listarSociosVencidos();

	public String getNombreSocioMasActivo();

	public List<SocioResponse> buscarSociosMasActivos();
}
