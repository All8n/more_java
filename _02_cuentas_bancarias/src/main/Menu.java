package main;

import java.util.ArrayList;
import java.util.Scanner;

import model.Movimiento;
import service.CuentaMovimientos;

/*Hacer la capa de presentación de aplicación banco

Al iniciar el programa, se solicita al usuario la introducción
de un saldo inicial y un límite. A partir de ahí, aparecerá el siguiente menú:

1.- Ingresar dinero
2.- Extraer dinero
3.- Consultar saldo y movimientos
4.- Salir*/

public class Menu {

	static CuentaMovimientos cuentamov;
 
	public static void main(String[] args) {
		double saldo,limite;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce saldo");
		saldo=Double.parseDouble(sc.nextLine());
		System.out.println("Introduce limite");
		limite=Double.parseDouble(sc.nextLine());
		cuentamov=new CuentaMovimientos(saldo,limite);
		
		int opcion;
		do {
			mostraMenu();
			opcion=sc.nextInt();//le la opcion elegida
			switch(opcion) {//evaluamos la opcion
			
			case 1:
				IngresarDinero();
				break;
			case 2:
				ExtraerDinero();
				break;
			case 3:
				ConsultarSaldoMovimientos();
				break;
			case 4:	
				
				System.out.println("--Adios--");
				
			}
			
			
		}while(opcion!=4);

	}
	static void mostraMenu() {
		
		System.out.println("1.- Ingresar dinero");
		System.out.println("2.- Extraer dinero");
		System.out.println("3.- Consultar saldo y movimientos");
		System.out.println("4.- Salir");

	}
	static void IngresarDinero() {
		Scanner sc=new Scanner(System.in);
		double cantidad;
		System.out.println("Introduce cantidad");
		cantidad=Double.parseDouble(sc.nextLine());
		cuentamov.ingresar(cantidad);

		
	}
	static void ExtraerDinero() {
		Scanner sc=new Scanner(System.in);
		double cantidad;
		System.out.println("Introduce cantidad");
		cantidad=Double.parseDouble(sc.nextLine());
		cuentamov.extraer(cantidad);
	}
	static void ConsultarSaldoMovimientos() {
		
		ArrayList<Movimiento>movs=cuentamov.obtenerMovimientos();
			for(Movimiento m:movs) {
				System.out.println(m.getTipo()+":"+m.getCantidad());
			}
			System.out.println("Saldo final: "+cuentamov.obtenerSaldo());
		}
		
	}


