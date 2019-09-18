package PracticeJava;

public class ArrayComparison {

	public static boolean eq(int[] a,int[] b) {
		
		
		//Same Length
		if(a.length!=b.length)  return false;
		
		//check each corresponding pair
		for (int i = 0; i < a.length; i++) {
		
			if (a[i]!=b[i]) 
				
				return false;
			
		}
		
		//all elements must be equal
		
		return true;
		
	}
	//array declaration

	public static void main(String[] args) {
		
		int[] a= {2,5,63,89};
		
		int[] b= {5,36,45,12};
		
		int[] c= {12,25,96,85};
		
		int[] d = {2,5,63,89};
		
		System.out.println(eq(a,a));
		
		System.out.println(eq(a,b));
		
		System.out.println(eq(a,c));
		
		System.out.println(eq(a,d));
			
	}
	
}