package PracticeJava;

import java.util.Scanner;

public class AvgAndSum2Num {

	public static void main(String[] args) {
		
		int a,b,sum;
		
		float avg;
		
		try {
			
		System.out.println("Enter a value : ");
		
		Scanner in = new Scanner(System.in);
		
		a = in.nextInt();
		
		b = in.nextInt();
		
		sum = a+b;
		
		avg =  (float)((a+b)/2);
		
		System.out.println("Average Of Two Numbers : "+ avg);
	

		} catch (Exception e) {
			
			System.out.println("Just Only Accept Intergers");
			
		}
		
		
	}

}
