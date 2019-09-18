package PracticeJava;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		

		int num;
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		int f1,f2=0,f3=1;
		
		for (int i = 0; i < num; i++) {
			
			System.out.println(f3+ "   " );
			
			f1 = f2;
			
			f2 = f3;
			
			f3 = f1+f2;
				
			
		}
		
	}

}
