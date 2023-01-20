package service;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

import model.Ciudad;

public class CiudadesService {
	List<Ciudad> ciudades=new ArrayList<>();
	
	public boolean guardarCiudad(Ciudad ciudad) {
		if(ciudades.stream()
				.noneMatch(c->c.getNombre().equals(ciudad.getNombre())&&c.getPais().equals(ciudad.getPais())))
		{
		ciudades.add(ciudad);
		return true;
	}
	return false;
	}
	public int totalCiudadesPais(String pais) {
		return (int)ciudades.stream()
		.filter(n->n.getPais().equals(pais))//Stream<Pais>
		.count();
		
		
			
		
	}
	public Ciudad ciudadMasPoblada() {
		return ciudades.stream()
		.max((c1,c2)->c1.getHabitantes()-c2.getHabitantes())//optional<Ciudad>
		.orElse(null);
		
		
	}
	public Ciudad buscarCiudad(String nombre, String pais) {
		return ciudades.stream()
				.filter(c->c.getNombre().equals(nombre)&&c.getPais().equals(pais))//Stream<Ciudad>
				.findFirst()//Optional<Ciudad>
				.orElse(null);
	}
	public Ciudad ciudadMasFria() {
		
		return 	ciudades.stream()
		.min((t1,t2)->Double.compare(t1.getTemperatura(), t2.getTemperatura()))
		.orElse(null);
				
		
	}
	//metodo que devuelva el total de paises registrados
	public int paisesRegistrados() {
		return (int) ciudades.stream()//Stream<Ciudad>
				.map(c->c.getPais())//Stream<String> transforma cada objeto del stream en otro objeto(cadena de caracteres)
				.distinct()//Stream<String>
				.count();
		
		
		
		
	}
	//temperatura media de las ciudades cuyo pais se recibe como parametro
	public OptionalDouble mediaPiases(String pais) {
		return 	ciudades.stream()
				.filter(c->c.getPais().equals(pais))
				.mapToDouble(c->c.getTemperatura())
				.average();
			
	}

}
