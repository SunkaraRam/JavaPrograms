package logicalprograms;

public class amstrongnumber 
{
	public static void main(String[] args) 
	{
		int a,c=0,temp;
      int n=253;
      temp=n;
      while (n>0) 
      {
    	  a=n%10;
    	  n=n/10;
    	  c=c+(a*a*a);
	}
      if (temp==c) 
  	{
  	  System.out.println("given number is amstrong");	
  	}
  	else {
  		System.out.println("given number is not amstrong");
  	}	
      }
}
