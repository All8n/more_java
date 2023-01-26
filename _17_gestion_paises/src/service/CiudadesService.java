package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

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
	//devuelve la lista de ciudades que pertenecen a un determinado pais
	public List<Ciudad> totalCiudadesPais(String pais) {
		return ciudades.stream()
		.filter(n->n.getPais().equals(pais))//Stream<Pais>
		.collect(Collectors.toList());
		
		
			
		
	}
	//devuelve todas la ciudades ,agrupadas por pais
	
	public Map<String, List<Ciudad>>ciudadesPorPais(){
		
						return ciudades.stream()
								.collect(Collectors.groupingBy(Ciudad::getPais));//referencia metodos

								//.collect(Collectors.groupingBy(s->s.getPais()));
	}
	//devuelve total de habitantes de un determinado pais
	public int habitantesPorPais(String pais){
		return   ciudades.stream()
				.filter(c->c.getPais().equals(pais))
			    .collect(Collectors.summingInt(Ciudad::getHabitantes));//referencia metodos

				//.collect(Collectors.summingInt(c->c.getHabitantes()));
				
						
				
		
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
				.map(Ciudad::getPais)//referencia metodos
				//.map(c->c.getPais())//Stream<String> transforma cada objeto del stream en otro objeto(cadena de caracteres)
				.distinct()//Stream<String>
				.count();
		
		
		
		
	}
	//temperatura media de las ciudades cuyo pais se recibe como parametro
	public OptionalDouble mediaPiases(String pais) {
		return 	ciudades.stream()
				.filter(c->c.getPais().equals(pais))
				.mapToDouble(Ciudad::getTemperatura)//referencia metodos
				//.mapToDouble(c->c.getTemperatura())
				.average();
			
	}
	

}
