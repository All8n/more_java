package principal;

import java.util.Collection;

public class Numeros {
		
	public int sumaCollection(Collection<Integer>col){
		
		int suma=0;
		for(Integer n:col) {
			suma+=n;
		}
		return suma;
		
	}
	//realizar un segundo metodo , que reciba dos colecciones de numeros
	//y nos diga cuantos numeros se encuentran en ambas selecciones

}
