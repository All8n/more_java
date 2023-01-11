package service;

public class Cuenta {
	/*Enunciado:

		Crear una clase Cuenta que represente una cuenta bancaria. 
		La clase tendrá un atributo saldo que represente el saldo de la cuenta y que será
		inicializado en los constructores.
		Habrá tres métodos: ingresar, extraer y obtenerSaldo*/
	
	private double saldo;
	public Cuenta() {
		saldo=100;
		
	}
	public Cuenta(double saldo) {
		this.saldo=saldo;
		
	}
	//metodo
	
	public void ingresar(double cantidad) {
		
		saldo+=cantidad;
		
	}
	public void extraer(double cantidad) {
		saldo-=cantidad;
	}
	public double obtenerSaldo() {
		
	return saldo;
	}
}
