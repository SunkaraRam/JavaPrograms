package logicalprograms;

public class inarrayprintlargesmallvalues {

	public static void main(String[] args) 
	{
       int a[]= {1,2,3,4,5,6,7,8,9};
       int large=a[0];
       int small=a[0];
       for (int i = 0; i < a.length; i++) 
       {
         if (large<a[i]) 
         {
			large=a[i];
		 }
         else if (small>a[i]) 
         {
			small=a[i];
		 }
	   }
       System.out.println("large value is:"+large);
       System.out.println("large value is:"+small);
	}
}
