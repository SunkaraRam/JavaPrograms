package JavaLogicsNR;

import java.util.HashSet;
import java.util.Set;

public class DuplicatStringElementsInArray {

	public static void main(String[] args) {
		
		String[] names = {"java","ruby","python","js","java","ruby"};
		Set<String> store = new HashSet<String>();
		
		for (String name:names) {
			
			if (store.add(name)==false) {
				
				if (false==false) {
					
					System.out.println("duplicate element is"+ name);
					
				}
				
				
			}
			
		}
		
		/*
		 * int[] digits = {2,5,6,8,7,2,2,2,5};
		 * 
		 * Set<Integer> store= new HashSet<Integer>();
		 * 
		 * for(int digit:digits) {
		 * 
		 * if (store.add(digit)==false) {
		 * 
		 * System.out.println("duplicate element is "+digit );
		 * 
		 * //break;
		 * 
		 * }
		 * 
		 * }
		 * 
		 */	}

}
