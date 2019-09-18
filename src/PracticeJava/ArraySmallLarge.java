package PracticeJava;

public class ArraySmallLarge {

	public static void main(String[] args) {
		
		int numArray[]=new int[] {25,6,85,32,45};
		
		int smallNo = numArray[0];
		int largeNo = numArray[0];
	
		for(int i =1; i <numArray.length;i++) {
			
			if (numArray[i]>largeNo) {
				
				largeNo = numArray[i];
			}
			
			
			else if (numArray[i]<smallNo) 
			{	
				smallNo = numArray[i];
		     }
			
			
		}
				
				System.out.println("LargeNumber :" + largeNo);
				

				System.out.println("SmallNumber :" + smallNo);}
				
			
	

}
