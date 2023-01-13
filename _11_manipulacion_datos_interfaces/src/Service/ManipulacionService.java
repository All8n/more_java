package Service;

import java.util.List;
import java.util.function.Predicate;

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

}
