package service;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ProductosServiceIo {
	private String ruta="c:\\ficheros\\productos.txt";
			
	//metodo que devuelve la lista de productos
	public List<String> listaProductos() {
		List<String> resultado=new ArrayList<>();
		try(FileReader fr=new FileReader(ruta);
				BufferedReader bf=new BufferedReader(fr);){
			String s;
			while((s=bf.readLine())!=null) {
				resultado.add(s);
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		return resultado;
	}
		
		
		
	
	
	//metodo que a partir del nombre de un producto , nos dice si esta o no almacenado 
	
	public boolean existeProducto(String producto) {
		try(FileReader fr=new FileReader(ruta);
				BufferedReader bf=new BufferedReader(fr);){
			String s;
			while((s=bf.readLine())!=null) {
				if(s.equals(producto)) {  //encontrado
					return true;
				}
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		return false;
	}
	
	//metodo que recibe un producto y lo guarda
	
	public void grabarProducto(String producto) {
		try(FileOutputStream fo=new FileOutputStream(ruta,true);
				PrintStream out=new PrintStream(fo);){
			out.println(producto);
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}
	
	//metodo que recibi una lista de productos y lo guarda
	public void grabarProductos(List<String> productos) {
		try(FileOutputStream fo=new FileOutputStream(ruta,true);
				PrintStream out=new PrintStream(fo);){
			for(String p:productos) {
				out.println(p);
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
}
	


