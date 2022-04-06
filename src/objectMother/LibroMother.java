package objectMother;

import java.util.ArrayList;
import java.util.List;

import modelo.Libro;

public class LibroMother {
	public static List<Libro> getLibros(){
		String[] ISBN= {"1","2","3","4","5","5"};
		String[] referencia= {"1a","2a","3a","4a","5a","5b"};
		ArrayList<Libro> libros=new ArrayList<>();
		for (int i = 0; i < referencia.length; i++) {
			libros.add(new Libro(ISBN[i], referencia[i]));
		}
		return libros;
	 }
}
