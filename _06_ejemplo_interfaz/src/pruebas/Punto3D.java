package pruebas;

import interfaces.Operaciones;

//el extends Punto hereda todos los atributos que tiene 

public class Punto3D extends Punto implements Operaciones{
	
	//atributo nuevo para la clase Punto
	private int z;
	
	//constructor
	public Punto3D(int z) {
		//siempre que creas un objeto de una clase
		//siempre hay una llamada al constructor sin parametro
		super(20,8); //llamada a constructores con parametros de la superclase
		this.z=z;
		
	}
	public Punto3D(int x, int y, int z) {
		//la llamama del constructor del padre super se encarga de llamar a x,y
		//mientras que nosotros nos encargamso de llamar a la z
		super(x,y);
		this.z=z;
		
	}
	//metodo
	public void mover(int d) {
		
		//x=x+d; //no tiene acceso, porque son privados
		//y=y+d;
		
		//llamas al metodo heredado
		setX(getX()+d);//modificamos atributos heredados a travez de setter
		setY(getY()+d);
		z=z+d;
		
		
	}
	//sobreescribir el metodo dibujar ()
	//se tiene que poner el metodo igual al que quieras sobreescribir
	//si te equicovas en alguna letra,etc. estarias creando otro metodo y no dara fallo
	@Override //evita los fallos a la hora de sobreescribir 
	public void dibujar() {
		
		//se ponen los get porque son privadas 
		//(System.out.print("Coordenadas: "+ getX()+","+getY()+","+z);
		super.dibujar();//llama a la version original del metodo
		
		System.out.println(","+z);	
	}
	@Override
	public void girar(int a) {
		setX(getX()+a);
		
	}
	@Override
	public int invertir() {
		z-=2;
		return 0;
	}
	

}
