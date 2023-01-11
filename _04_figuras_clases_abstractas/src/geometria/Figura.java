package geometria;
//clase que representa de forma generica a una figura geometrica 

public abstract class Figura {
	
	private String color;
	public Figura(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
		
	}
	public abstract double superficie();
	
	

}
