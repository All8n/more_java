package principal;

import java.util.ArrayList;
import java.util.List;

public class TestReplace {

	public static void main(String[] args) {
		List<Integer> nums=new ArrayList(List.of(8,2,5,11,4));
		//reemplazar cada elemnto de la lista por su cuadrador
		
		//tradicional
		for(int i=0;i<nums.size();i++) {
			nums.set(i, nums.get(i)*nums.get(i));
		}
			
		//funcional(replaceall)
		
		nums.replaceAll(n->n*n);
		
		nums.forEach(n->System.out.println(n));
		
		}
	}


