package principal;

import java.util.Arrays;
import java.util.List;

public class Test8FlatMap {

	public static void main(String[] args) {
		//dadas las notas de un centro de formacion , donde cada array
		//contiene las notas de un aula , calcular la media global 
		
		List<double[]> notas=List.of(new double[]{3.5,7,8.9},
		new double[]{2.4,5,1.9,6.7},
		new double[]{5.6,3.2,8,10},
		new double[]{9.1,4});
		
		System.out.println(notas.stream()//Stream<double[]>
		
	   .flatMapToDouble(a->Arrays.stream(a))
		.average()
		.orElse(0));
		
		
		
	}

}
