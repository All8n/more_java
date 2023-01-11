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

	public int recibirCollection(Collection<Integer>col1,Collection<Integer>col2) {
		int rep=0;
		for(Integer n:col1) {//recorre la primera coleccion
			if(col2.contains(n)) {//si la coleccion 2 contiene algo de la coleccion 1
				rep++;//aumenta
			}
		}
		return rep;

	}
}

