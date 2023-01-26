package principal;

import java.util.List;

public class Test7Map {

	public static void main(String[] args) {

		List<String> nombres=List.of("leche","atún","vino","patatas","leche","agua","vino","lechuga");
		
		//cuantos productos,no repetidos,tienen mas de 6 caracteres?
		
		nombres.stream()
		.distinct()
		.filter(n->n.length()>6)
		.count();
		
		nombres.stream()
		.distinct()//Stream<String>
		.map(String::length)
		//.map(s->s.length())//Stream<Integer>
		.filter(n->n>6)
		.count();
		
		//suma total de caracteres de todas las cadenas no repetidas
		System.out.println(nombres.stream()
		.distinct()//Stream<String>
		.mapToInt(String::length)
		//.mapToInt(s->s.length())//intStream
		.sum());
	}

}
