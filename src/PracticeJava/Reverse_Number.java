package PracticeJava;

import java.util.Scanner;

public class Reverse_Number {

	static int num , remainder;
	
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter a Number : ");
		
		num = sc.nextInt();
		
		int reverse=0;
		
		while (num > 0) {

			remainder=num%10;
			
			reverse = reverse*10+remainder;
			
			num= num/10;
	
			
		}
		
		System.out.println("Reverse Number : " + reverse);
	
	
	}
	

}
