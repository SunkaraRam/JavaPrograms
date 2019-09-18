package PracticeJava;

import java.util.Scanner;

public class Swapping2Num {

	
	public static void main(String[] args) {
		
		int num1 = 400;
		
		int num2 = 1600;
		
		num1 = num1+num2;
		
		num2 = num1-num2;
		
		num1 = num1-num2;
		
		System.out.println(num1);
		
		System.out.println(num2);
		
		
	}
/*
	
	public static void main(String[] args) {
		
		int a,b,c,temp;
		
		System.out.println("Enter a and b ");
		
		Scanner in = new Scanner(System.in);
		
		a = in.nextInt();
		
		b = in.nextInt();
		
		System.out.println("Before Swapping Two Numbers : \na="+a+"\nb="+b);
		
		temp = a;
		
		a= b;
		+
		b=temp;
		
		System.out.println("Afer Swapping Two Number : \na="+a+"\nb = " +b);
		
		
	}
*/
}

