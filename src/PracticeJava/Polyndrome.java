package PracticeJava;

import java.util.Scanner;

public class Polyndrome {

	static int num;
	
	static int a,reverse = 0;
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter a Number : ");
		
		num = sc.nextInt();
		
		a=num;
		
		reverse= 0;
		
		while (num>0) {

			int remainder = num%10;
			
			reverse = reverse*10+remainder;
			
			num = num/10;
			
		}
		
		System.out.println("The given Number in reverse : " + reverse);
		
		if (reverse==a) {

			System.out.println(reverse+" is polindrome ");
		} 
		else {

			System.out.println(reverse+" is not polindrome ");

		}
		
	}

}
