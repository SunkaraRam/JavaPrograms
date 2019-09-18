package logicalprograms;

public class secondsmallnumberinarray {

	public static void main(String[] args) 
	{
	int a[]= {1,2,3,4,5,6,7,8,9};
	int temp;
	
	for (int i = 0; i < a.length; i++)
	{
	   for (int j = 0; j < a.length; j++) 
	   {
		   if (a[i]>a[j])
		   {
			  temp=a[i];
			  a[i]=a[j];
			  a[j]=temp;
		   }
	    }	
	 }
       System.out.println("second small number in array:"+a[a.length-2]);
	}

}
