package principal;

import java.util.Arrays;
import java.util.List;

public class Test3Filter {

	public static void main(String[] args) {

		
		List<Integer>nums=List.of(6,11,-4,8,-5,6,10,8,2,11,27-5,-12,41,10);
		//cuantos numeros pares diferentes hay?
		System.out.println(nums.stream().
		distinct()//quitamos los duplicados
		.filter(n->n%2==0)//nos quedamos con los pares 
		.count());
		/*List<String>nombres=List.of("leche","atun","vino","patatas","leche","agua","vino","lechuga");*/
		String nombres="leche,atun,vino,patatas,leche,agua,vino,lechuga";

		//cuantos nombres diferentes de menos de 6 caracteres hay
		System.out.println(
				Arrays.stream(nombres.split(","))//stream <String>
				.distinct()
				.filter(n->n.length()<6)
				.count());
		
	
		/*System.out.println(nombres.stream()
		.distinct()
		.filter(n->n.length()<6)
		.count());*/
	
	
	}

}
