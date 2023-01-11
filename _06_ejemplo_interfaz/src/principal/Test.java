package principal;

import interfaces.Operaciones;
import pruebas.Mesa;
import pruebas.Punto3D;

//polimosfirmo con interfaces

public class Test {

	public static void main(String[] args) {

			Operaciones op;
			/*op=new Mesa(2,7,3);
			op.invertir();
			op=new Punto3D(1,6,2);
			op.invertir();*/
			
			procesar(new Mesa(2,7,3));
			
			procesar(new Punto3D(1,6,2));
			
	}
	static void procesar(Operaciones op) {
		op.girar(10);
		System.out.println(op.invertir());
		
	}

}
