package service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import model.Manipulacion;

public class ManipulacionService {
	
	List<Manipulacion> manipulaciones=new ArrayList<>();
	
	
  //que devuelve 				   //que recibe
	public void añadirProducto(Manipulacion manipulacion) {
		
		manipulaciones.add(manipulacion);
			
		
	}
	//sube el precio a todos los productos
	public void  agregarPorcentaje(int porcentaje ) {
		manipulaciones.replaceAll(p->{
			p.setPrecio(p.getPrecio()+(p.getPrecio()*porcentaje/100));
			return p;
		});
	}
		//sube el precio a los productos que cumplen una con condición
		public void subirPrecioConCondicion(int porcentaje, Predicate<Manipulacion> cond) {
			manipulaciones.replaceAll(p->{
				if(cond.test(p)) {
					p.setPrecio(p.getPrecio()+(p.getPrecio()*porcentaje/100));
				}
				return p;	
			});
		}
		
	

	public  void ordenarPorPrecio() {
		//derivamos la comparacion al metodo compare del double
		manipulaciones.sort((a,b)->Double.compare(a.getPrecio(), b.getPrecio()));
	
		
	}	
	public void  eliminarCategoria(String categoria) {
		manipulaciones.removeIf(p->p.getCategoria().equals(categoria));
		
	}
	public List<Manipulacion> datosProductos() {
		return manipulaciones;
		
			
	}
}
