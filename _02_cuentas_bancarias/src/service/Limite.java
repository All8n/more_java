package service;

/*segunda partes:
Crear una subclase de Cuenta que incluya un nuevo atributo limite, 
que servirá para definir el límite máximo de dinero que se podrá extraer.  
También incluirá un nuevo método, llamado ajustarLimite(), 
que establecerá automáticamente como límite la mitad del saldo existente*/

public class Limite  extends Cuenta{
	private double limite;
	public Limite(double saldo, double limite) {
		super(saldo);
		this.limite=limite;

		
	}
	
	public Limite() {
		this.limite=50;			
		
	}
	public void ajustarLimite() {
		
		limite=obtenerSaldo()/2;
		
	}
	//sobreescritura de extraer
	@Override
	public void extraer(double cantidad) {
		if(cantidad<=cantidad) {
			super.extraer(cantidad);//llama al extraer de la superclase	
		}else {
			super.extraer(limite);//si quiere extraer mas del limite , solo le permite el limite
		}
		
	}
		

}
