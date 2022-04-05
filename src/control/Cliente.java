package control;

import modelo.Socio;
import repositories.Reporp;
import repositories.SocioRepository;
import repositories.SocioRepositoryImpl;
import repositories.SocioRepositoryImplFich;

public class Cliente {

	public static void main(String[] args) {
		SocioRepositoryImpl mipl=new SocioRepositoryImpl();
		Reporp objetillo=new Reporp();
		objetillo.reposita(mipl);
		SocioRepositoryImplFich mipl2=new SocioRepositoryImplFich();
		objetillo.reposita(mipl2);
	}

	
}
