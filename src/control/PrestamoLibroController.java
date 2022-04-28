package control;

public interface PrestamoLibroController {
	public boolean prestarLibro(Long idSocio,String referenciaLibro);
	
	public boolean devolverLibro();
}
