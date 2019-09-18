package PracticeJava;

import java.util.Scanner;

public class Find_Factorial {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int input = in.nextInt();
		
		int result = 1;
		
		while (input >0) {
			
			result = result*input;
			
			input --;
			
		}
		
		System.out.println("Factorial of the geven integet : " + result);
	}

}
