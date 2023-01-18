package service;

import java.util.ArrayList;
import java.util.List;

import model.Manipulacion;

public class ManipulacionService {
	
	List<Manipulacion> manipulaciones=new ArrayList<>();
	
	
  //que devuelve 				   //que recibe
	public void añadirProducto(Manipulacion manipulacion) {
		
		manipulaciones.add(manipulacion);
			
		
	}
	
	public void  agregarPorcentaje(int porcentaje ) {
		manipulaciones.replaceAll(p->{
			p.setPrecio(p.getPrecio()+(p.getPrecio()*porcentaje/100));
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
