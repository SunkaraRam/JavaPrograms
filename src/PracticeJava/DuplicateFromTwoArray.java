package PracticeJava;

public class DuplicateFromTwoArray {

	public static void main(String[] args) {
		
		int[] a = {5,9,8,6,7,};
		
		int[] b = {7,8,1,6,2,4,3};
		
		for (int i = 0; i < b.length; i++) {
			
			//System.out.println(b[i]);
			
			for (int j = 0; j < a.length; j++) {
				
				if (a[j]==b[i]) {
			
					//System.out.println(a[j]==b[i] );
					System.out.println(b[i]);
					
				}
				
			}
			
		}
		
		
		
		
	}
	
	
	
}
