package principal;

import java.util.List;
import java.util.Optional;

public class Test4FindFirst {

	public static void main(String[] args) {
		List<String>nombres=List.of("leche","atun","vino","patatas","leche","agua","vino","lechuga");
		//mostrar el nombre del primer producto que comience por "a", si no hubiera ninguno
		//muestra el mensaje "no hay ningunol".
		
		System.out.println(nombres.stream()//Stream<String>
		.filter(n->n.startsWith("a"))//devuelve un stream de cadenas Stream<String>
		.findFirst()//optional<String>
		.orElse("no hay ninguno"));// devuelve una cadena de caracteres String
					
	}

}
