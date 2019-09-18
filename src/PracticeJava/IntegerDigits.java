package PracticeJava;

import java.util.Scanner;

public class IntegerDigits {

	public static void main(String[] args) {
		
		int input ; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the values of calculate int : ");
		input = sc.nextInt();
		
		int sum = 0;
		
		while (input!=0) {
			
			//Gives last digit of the Input number
			
			int lastdigite = input%10;
			
			 sum = lastdigite+sum;
	
			//Remove the last digit of the given integer
			
			input = input/10;
		}
		
		 System.out.println("Sum of its digits " +sum);
	}

}
