package service;

import java.util.ArrayList;

import model.Movimiento;

/*tercera parte:
Se creará una nueva clase que registre los movimientos realizados en la cuenta (ingreso y extracción).
Cada movimiento se caracteriza por una cantidad y un tipo (ingreso o extracción).
Incorporará un nuevo método que devuelva los movimientos registrados*/

public class CuentaMovimientos extends CuentaLimite{
	private ArrayList<Movimiento> movimientos=new ArrayList<>();
	
	//constructor
	public CuentaMovimientos(double saldo, double limite) {
		super(saldo,limite); //llamada a constructor de CuentaLimite
	}
	//y lo que falte....(sobrescribir ingresar y extraer para que registren el movimiento)
	
	
	public ArrayList<Movimiento> obtenerMovimientos(){
		return movimientos;
	}


	@Override
	public void extraer(double cantidad) {
		movimientos.add(new Movimiento(cantidad, "extracción"));
		super.extraer(cantidad);
	}
		

	@Override
	public void ingresar(double cantidad) {
		movimientos.add(new Movimiento(cantidad, "ingreso"));
		super.ingresar(cantidad);
	}
}
	
	


