package service;

import java.util.List;
import java.util.function.Predicate;

import model.Alumno;
import model.Curso;

public class FormacionService {
	private static List<Curso> cursos=List.of(new Curso("Java for dummies",50,List.of(
				
				                                    new Alumno("alumno1",25,7) ,
				                                    new Alumno("alumno2",32,2) ,
				                                    new Alumno("alumno3",19,8) 
													)),
									     	  new Curso("Spring",60,List.of(
													
								                    new Alumno("alumno5",18,6.9) ,
								                    new Alumno("alumno4",40,3.2) ,
								                    new Alumno("alumno8",28,6) 
								                    )),
										      new Curso("JavaScript",75,List.of(			
													new Alumno("alumno2",32,7.1),
													new Alumno("alumno4",40,8.3),
													new Alumno("alumno7",33,4)
													))	
				);
	
	//duracion media de todos los cursos
	public double duracionMedia() {
		cursos.stream()
		.mapToInt(n->n.duracion())
		.average();
		
	}
	
	//lista de cursos con numeros de alumnos inferior a un determinado valor
	public List<Curso> cursosInferiorAlumnos(int numAlumnos	){
			return cursos.stream()
					.filter(n->n.equals(matriculas))
					.anyMatch 	(n(matriculas));
		
	}
	
	//edad media del curso de una determinada denominacion
	
	public double duracionMediaCursos(String denominacion) {
		
		
	}
	//lista de nombres de alumnos
	public List<String> nombresAlumnos(){
		
		
	}
	
	//nota media de todos los cursos	
	
	public double notaMediaCursos() {
		
	}
	
	//lista de alumnos aprobados 
	public List<Alumno> aprobados(){
		
	}

}
