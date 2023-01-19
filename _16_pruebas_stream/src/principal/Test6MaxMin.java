package principal;

import java.util.List;

public class Test6MaxMin {

	public static void main(String[] args) {
		
		List<Integer>nums=List.of(6,11,-4,8,-5,6,10,8,2,11,27-5,-12,41,10);
			
		//Mostrar el número negativo más pequeño
		
		nums.stream()
		.filter(n->n<0)
		.min((a,b)->a-b)//los ordena de forma natural y muestra el mas bajo
		.ifPresentOrElse(n->System.out.println(n),()->System.out.println("no hay ninguno"));
	}

}
