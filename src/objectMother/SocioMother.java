package objectMother;

import java.util.ArrayList;
import java.util.List;

import modelo.Socio;

public class SocioMother {
 public static List<Socio> getSocios(){
	Long[] ids= { 1L,2L,3L,4L,5L};
	String[] nombres= {"Arturo","Jaun","Felipe","Jaun","Patricia"};
	String[] dps= {"a","a","a","a","a"};
	ArrayList<Socio> socios=new ArrayList<>();
	for (int i = 0; i < dps.length; i++) {
		socios.add(new Socio(ids[i], nombres[i], dps[i]));
	}
	return socios;
 }
}
