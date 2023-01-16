package view;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

import Service.ManipulacionService;

public class PruebaDatos {

	public static void main(String[] args) {
		
		//List es una lista inmodificable
		
		List<Integer> nums=List.of(3,8,2,11,4,9);
		
		ManipulacionService service=new ManipulacionService();
		
		//mostrar suma de los pares por un lado y suma por positivos por otro
		 //forma creando el objeto
	/*	Predicate<Integer>condicion=new Predicate<Integer>(){
			
			@Override
			public boolean test(Integer t) {

				return t%2==0;//devuelve true si es par
			}
		};
		System.out.println("Suma pares: "+ service.sumaPorCriterio(nums, condicion));
		
		
		//los positivos
		//forma creando anonimo
		System.out.println("Suma positivos: "+service.sumaPorCriterio(nums,new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t>0; //devuelve true si positivo
			}
		}));
		/*service.sumaPorCriterio(nums, new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {

				return t%2==0;//devuelve true si es par 
			}
		});*/
		
		//con lambdas    t-> cualquier variale(t)( (t)+ condicion) <- es un objeto 
	System.out.println("Suma pares:" + service.sumaPorCriterio(nums, t->t%2==0));
	System.out.println("Suma positivos"+service.sumaPorCriterio(nums, t->t>0));
	
			service.procesaLista(nums, t->System.out.println(t));
			service.procesarColeccionPorCritero(nums, t->System.out.println(t),t->t%2==0);
			service.procesarColeccionPorCritero(nums,
					t->{
						String ruta ="c:\\temp\\lambda.txt";
						
						try (FileOutputStream fos=new FileOutputStream(ruta,true);
									PrintStream out=new PrintStream(fos); ){
							out.println(t);
						}catch(IOException ex) {
							ex.printStackTrace();
						}
					},
					t->t>0);
			//suma de los cuadrados de la lita
			System.out.println(service.sumaTransformados(nums, t->t*t));
	}

}
