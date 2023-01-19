package service;

import java.util.ArrayList;
import java.util.List;

import model.Ciudad;

public class CiudadesService {
	List<Ciudad> ciudades=new ArrayList<>();
	
	public boolean guardarCiudad(Ciudad ciudad) {
		return ciudades.add(ciudad);
	}
	public void totalCiudadesPais(String pais) {
		ciudades.stream()
		.filter(n->n.getPais().equals());
		
		
		
		
	}
	public Ciudad ciudadMasPoblada() {
		return ciudades.stream()
		.max((c1,c2)->c1.getHabitantes()-c2.getHabitantes())//optional<Ciudad>
		.orElse(null);
		
		
	}
	public Ciudad buscarCiudad(String nombre, String pais) {
		
	}
	public Ciudad ciudadMasFria() {
		
	return 	ciudades.stream()
		.min((t1,t2)->Double.compare(t1.getTemperatura(), t2.getTemperatura()))
		.orElse(null);
				
		
	}

}
