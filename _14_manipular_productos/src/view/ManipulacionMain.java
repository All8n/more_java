package view;

import java.util.List;
import java.util.Scanner;

import model.Manipulacion;
import service.ManipulacionService;

public class ManipulacionMain {
	
	static ManipulacionService manipulacionService=new ManipulacionService();
	
	public static void main(String[] args) {		

		Scanner sc=new Scanner(System.in);
		int opcion;
		do {
			mostraMenu();	
			opcion=sc.nextInt();//le la opcion elegida
			switch(opcion) {//evaluamos la opcion
			
			case 1:
				añadirProducto();
				break;
			case 2:
				subirPrecio();
				break;
			case 3:
				ordenarProducto();
				break;
			
			case 4 :
				eliminarProducto();
				break;
			case 5:
				subirPorCategoria();
				 break;
			case 6:
				mostrarProductos();
				break;
			case 7:
				
				System.out.println("--Adios--");
				
			}
			
			
		}while(opcion!=7);

	}
	static void mostraMenu() {
		
	System.out.println("1.- Añadir Producto");
	System.out.println("2.- Subir Precio");
	System.out.println("3.- Ordenar Productos");
	System.out.println("4.- Eliminar Productos");
	System.out.println("5.- Mostrar Productos");
	System.out.println("6.- Salir");
	}
	static void añadirProducto() {
		Scanner sc=new Scanner(System.in);
		String nombre;
		Double precio;
		String categoria;
		System.out.println("Nombre del producto: ");
		nombre=sc.nextLine();
		System.out.println("Precio del producto: ");
		precio=Double.parseDouble(sc.nextLine()	);
		System.out.println("Categoria del producto: ");
		categoria=sc.nextLine();
		manipulacionService.añadirProducto(new Manipulacion(nombre,precio,categoria));
	
		
	}
	static void subirPrecio() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce porcentaje de subida: ");
		manipulacionService.agregarPorcentaje(Integer.parseInt(sc.nextLine()));
	}
	static void ordenarProducto() {
		manipulacionService.ordenarPorPrecio();
		
	}
	static void eliminarProducto() {
		Scanner sc=new Scanner(System.in);
		String categoria;
		System.out.println("Introduce categoria: ");
		categoria=sc.nextLine();
		manipulacionService.eliminarCategoria(categoria);
		
	}
	static void subirPorCategoria() {
		Scanner sc=new Scanner(System.in);
		String categoria;
		int porcentaje;
		System.out.println("Introduce categoría:");
		categoria=sc.nextLine();
		System.out.println("Introduce porcentaje:");
		porcentaje=Integer.parseInt(sc.nextLine());
		
		manipulacionService.subirPrecioConCondicion(porcentaje, p->p.getCategoria().equals(categoria));
		
		
		
	}
	static void mostrarProductos() {
		List<Manipulacion> prods=manipulacionService.datosProductos();
		prods.forEach(p->System.out.println(p.getNombre()+":"+p.getPrecio()));
	
		
	}

}
