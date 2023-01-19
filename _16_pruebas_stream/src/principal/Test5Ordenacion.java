package principal;

import java.util.Comparator;
import java.util.List;

public class Test5Ordenacion {

	public static void main(String[] args) {

		List<Integer>nums=List.of(6,11,-4,8,-5,6,10,8,2,11,27-5,-12,41,10);
		//mostrar el numero negativo mas pequeño
		
		nums.stream()
		.filter(n->n<0)
		.sorted()
		.findFirst()//Optional<Integer>
		//si hay un valor lo muestra y si no, no hace nada
		.ifPresentOrElse(n->System.out.println(n), ()->System.out.println("No hay ningun negativo"));

	}

}
