package PracticeJava;

import java.util.Scanner;

public class Even_Or_Odd {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		
		num= sc.nextInt();
		
		if (num%2==0) {
			
			System.out.println(num + " Is an Ever Number.");
			
		} else {
			
			System.out.println(num + " Is an Odd Number");
		}
	}

}
