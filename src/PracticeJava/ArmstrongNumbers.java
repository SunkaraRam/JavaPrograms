package PracticeJava;

import java.util.Scanner;

public class ArmstrongNumbers {

	static Scanner in = new Scanner(System.in);
		
	public static void main(String[] args) {
		
		int num;
		
		int check = 0;
		
		System.out.println("Enter Number : ");
		
		num = in.nextInt();
		
		int a=num;
		
		while (num>0) {
			
			int remainder = num%10;
			
			check = check + (int) Math.pow(remainder, 3);
			
			num = num/10;
			
		}
		
		if(check==a) {
				
			System.out.println(a+ "is an Armstrong Number");

		}
		else {
			System.out.println(a+ "is not Armstrong Number");
		}
		

	}

}
