package Service;

import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ManipulacionService {
	
	/*public int sumaPares(List<Integer> numeros ) {
		int suma=0;
		
		for(int n:numeros) {
			if(n%2==0) {
			suma+=n;
			
			}
		}
		return suma;
		
	}
	
	public int sumaPositivos(List<Integer> numeros) {
			int suma=0;
		
		for(int n:numeros) {
			if(n>0) {
			suma+=n;
			
			}
		}
		return suma;
		
	}*/
	
	public int sumaPorCriterio(List<Integer> numeros, Predicate<Integer>condicion) {
		
		int suma=0;
		
		for(int n:numeros) {
			if(condicion.test(n)) {
				suma+=n;
			}
		}
		return suma;
		
	}
	//metodo que recibe lista de numeros y los imprime
	//metodo que recibe lista de numeros y los guarda en el fichero
	//metodo que recibe lista de numeros y los manda a la nube
	//mediante un unico metodo, aplicamos el proceso que nos mande a cada
	//elemento de la lista 
	
	public void procesaLista(List<Integer> numeros,Consumer<Integer>proceso) {
		
		for(int p:numeros) {
			proceso.accept(p);
			
				
			}
		} 
		//metodo que recibe una lista de numeros e imprime los pares 
		//metodo que recibe un conjunto de numeros y guarda en un fichero los positivos 
		// metodo que recibe una lista y guarda en un fichero los multiplos de cinco
		//metodo que recibe un conjunto de numeros e imprime los negativos
	
	public void procesarColeccionPorCritero(Collection<Integer>numeros,Consumer<Integer>proceso,Predicate<Integer> criterio) {
		for(Integer n:numeros) {
			if(criterio.test(n)) {
			proceso.accept(n);	
		}
		}
	}
	//metodo que recibe una lista y devuelve la suma de los cuadrados de los numeros de la lista
	//metodo que recibe una lista y devuelve la suma de las raices cubicas de los numero de la lista
	public int sumaTransformados(Collection<Integer> numeros, Function<Integer,Integer> fun) {
		int suma=0;
		for(Integer n:numeros) {
			suma+=fun.apply(n);//sumamos el resultado de transformar cada numero segun la funcion 
			
			
		}
		return suma;	
	}
	
	//metodo que recibe una lista y devuelve la suma de todos los elemntos de la lista , a la que añadimos 
	//valor extraido de un fichero
	//metodo que recibe una lista y devuelve la suma de todos los elementos de la lista , a le añadimos 
	//un numero leido desde un puerto externo
	public int sumaListaConValor(Collection<Integer> numeros, Supplier<Integer>data) {
		int suma=0;
		for(Integer n:numeros) {
			suma+=n;
			
		}
		return suma+data.get();
		}
	
	//metodo que reciba una lista de cadenas de caracteres y devuelva el total de vocales de aquellas 
	//que comienzan por "a"
	//metodo que recibe una lista de cadenas de caracteres y devuelve el total de caracteres de aquellas
	//que tengan mas de 5 letras
	
	public int contarCaracteres(Collection<String> textos,Function<String,Integer>fun,Predicate<String> cond) {
		int total=0;
		for(String cad:textos) {
			if(cond.test(cad)) {
				total+=fun.apply(cad);
			}
			
		}
		return total;


		
	}
}



