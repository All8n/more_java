package principal;
	
interface Printer{
	void print(String cad);
	//incluiremos un metodo estatico que proporcione una 
	//determinada implementacion de la interfaz
	static Printer of () {
		return new Printer() {

			@Override
			public void print(String cad) {
				System.out.println(cad);
					
			}
			
		};
	}
	
}



public class Test2 {

	public static void main(String[] args) {
		//podemos llamar al metodo estatico de la interfaz 
		//para que nos de una implementacion de ella, 
		//y asi no tener que crear
		//una clase de la implemente
		Printer pr=Printer.of();
		pr.print("Hello");
		

		
	}

}
