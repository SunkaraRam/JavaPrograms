package logicalprograms;
public class arraynumbersprintascindingorder {

	public static void main(String[] args) 
	{
	int a[]= {1,2,3,4,5,6,7,8,9};
	int temp;
	 for (int i = 1; i < a.length; i++) 
	 {
		for (int j = 1; j < a.length; j++) 
		{
		  if (a[j]<a[j-1])
		  {
			temp=a[j];
			a[j]=a[j-1];
			a[j-1]=temp;
		  }	
		}
	 }
	 for (int i = 0; i < a.length; i++) 
	 {
	   System.out.println(a[i]);	
	}
	}
	}