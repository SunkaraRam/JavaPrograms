package logicalprograms;

public class howtoswaapingtwovalueswithoutthirdvalue {

	public static void main(String[] args) 
	{
	  String a="narapa";
	  String b="rama";
	    System.out.println("before swapping");
	    System.out.println(a);
	    System.out.println(b);
	    a=a+b;
	    b=a.substring(0,a.length()-b.length());
	   
	    a=a.substring(b.length());
	   
	    System.out.println("affter swapping");
	    System.out.println(a);
	    System.out.println(b);
	    

	}

}
