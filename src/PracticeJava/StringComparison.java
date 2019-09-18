package PracticeJava;

import java.util.Scanner;

public class StringComparison {

	
	static String s1,s2;
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter First Name : ");
		
		s1= sc.nextLine();
		
		System.out.println("Enter Second Name : ");
		
		s2= sc.nextLine();
		
		boolean b =s1.contentEquals(s2);
		
		if (b==true) {
		
			System.out.println("Both String are Equal");
		}
		else {
		
			System.out.println("Both Strings are Not Equal");			
		}
		
	}

}
