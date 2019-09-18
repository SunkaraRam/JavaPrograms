package PracticeJava;

import java.util.Scanner;

public class Max3Number {

	static float a,b,c;
	
	static Scanner in;
	
	
	public static void main(String[] args) {
		
		
		try {
		 in = new Scanner(System.in);
		
		System.out.println("Enter a Value : ");
		
		a = in.nextInt();
		
		//a= in.nextFloat();
		
		System.out.println("Enter b value : ");
		
		//b = in.nextInt();
		
		b = in.nextFloat();
		
		System.out.println("Enter c Value : ");
		
		//c = in.nextInt();
		c = in.nextFloat();
		
		
		
		if (a>b && a>c) {
			
			System.out.println("A is biggerthan all"+"  " + a);
			
		}
		else if (b>a && b>c ) {

			System.out.println("B is biggerthan all"+"  " + b);
		}
		
		else if (c>a && c>b) {
			
			System.out.println("C is biggerthan all "+"  " + c);
			
		}
		
	
		
	} catch (Exception e) {
		
		System.out.println("Just only accept Float Values");
	}
		
	finally {
		System.out.println("Thanks ");
	}
	

}

}