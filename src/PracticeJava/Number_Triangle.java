package PracticeJava;

import java.util.Scanner;

public class Number_Triangle {


	static int num,n=1 ;
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
			
		System.out.println("Enter Num : ");

		num = sc.nextInt();
		/*
		for (int i = 1; i <=num; i++) {
			for (int j = i; j <=num; j++) {
				
				System.out.print(n+"");
				//System.out.print(n+" ");
				n++;
			}
			
		System.out.println();
			
		}
		*/
		
		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <=i; j++) {

				System.out.print(n+" ");
				
				n++;
			}
			
			System.out.println("");
		}
	
	
	}
	

}
