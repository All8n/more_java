package principal;

import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		List<Integer>nums=List.of(6,11,-4,8,-5,6,10,8,2,11,27-5,-12,41,10);

		
		//muestra los 7 primeros numeros de la lita, sin contar duplicados
		nums.stream().distinct().limit(7).forEach(n->System.out.println(n));
		
			//hay algun negativo?
		System.out.println("Algun negativo? "+nums.stream().
				anyMatch(n->n<0));
		

			//son todos pares?
		System.out.println("Algun par ?"+nums.stream().allMatch(n->n%2==0));
			
	}

}
