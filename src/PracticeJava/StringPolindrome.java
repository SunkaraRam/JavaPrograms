package PracticeJava;

import java.util.Scanner;

public class StringPolindrome {

	static String a,b="";
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		a= sc.nextLine();
		
		int n = a.length();
		
		for (int i = n-1; i >=0; i--) {
			
			b = b+ a.charAt(i);
			
		}
		
		System.out.println("Given String is in reverse  "+b);
		
		if (a.equalsIgnoreCase(b)) {
			
			System.out.println("Given String is polindrome  : "+ b);
			
		}
		else {
			System.out.println("Given String is Not polindromee : "+ b);
		}
		
		
		
	}

}
