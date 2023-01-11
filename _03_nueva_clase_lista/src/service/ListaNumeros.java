package service;

import java.util.ArrayList;

public class ListaNumeros extends ArrayList<Integer>{
	
	
	
	public Integer first () {
		
		return get(0);
		
	}
	public Integer last() {
		return this.get(size()-1);

		
	}
	public Integer sum() {
		
		int suma=0;
		for(int i=0;i<size();i++) {

			suma=suma+get(i);
		}
		return suma;
		}
	@Override
	public boolean add(Integer e) {
		
		//si no lo contiene, lo añade 
		 if(!contains(e)) {
		/*if(contains(e)==false) */
			return super.add(e);

		
		
	}
	return false;
		
	}
		

	
	
	
	}
	
	


