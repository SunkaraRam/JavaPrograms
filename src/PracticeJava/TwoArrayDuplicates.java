package PracticeJava;

	public class TwoArrayDuplicates{
		
		public static void main(String[] args) {
			
		
		
		
		int[] a = {2,5,6,7,8,};
		
		int[] b= {5,2,6,3,4,8};
		
		for (int i = 0; i < a.length; i++) 
		{
			
			for (int j = 0; j < b.length; j++) 
			{
								
				if (a[i]==b[j]) {
					
					System.out.println("This is duplicate Number : "+b[j]);
					
				} 
	
				
			}
			
						
		}
		
   }
		
}