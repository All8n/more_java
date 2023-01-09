package principal;

public class Punto {
	
	//el private solo se puede usar dentro de su propia clase 
	//aunque igualmente lo hereda
	private int x;
	private int y;
	
	//inicializa atributos 
	public Punto(int x, int y ) {
		this.x=x;
		this.y=y;
		
		
	}
	//inicializa a valores cualquiera 
	public Punto() {
		
		x=10;
		y=5;
		
	}
	
	public Punto (int a) {
		x=10;
		
	}
	
	//setter and getter 

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	//metodo
	public void dibujar() {
		
		System.out.print("Coordenadas: "+ x+","+y);
		
		
	}

}
