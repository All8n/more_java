package principal;

interface Datos{
	
	static void Print(){
		System.out.println("hello");
		
	}
}
class Prueba implements Datos{
	
}


public class Test {

	
	public static void main(String[] args) {
		Datos.Print();

	}

}
