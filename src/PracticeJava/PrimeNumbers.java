package PracticeJava;

import java.util.Scanner;

public class PrimeNumbers {
/*
	static int n , status=1 , num = 3;
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	
		n = sc.nextInt();
		
		if (n>1) {
			
			System.out.println("First "+"Prime Numbers are : ");
			
			System.out.println(2);
		}
		for (int count = 2; count <=n;) {
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num%i==0) {
					
					status=0;
					
					break;
				}
				
			}
			
		}
		
	}

*/
	
//	public static void main(String[] args) {
//		
//		int p;
//		
//		Scanner sc = new Scanner(System.in);
//
//		p=sc.nextInt();
//		
//		
//	boolean	flag = true;
//		
//		for (int i = 2; i <= p; i++) {
//
//			if (p%i==0) {
//				
//				flag= false;
//				
//			}
//			
//		}
//		if (flag) {
//			System.out.println("Prime");
//		}else {
//			System.out.println("NotPrime");
//		}
//	}
	


	public static void main(String[] args) {
		
//		int[] a = {5,6,8,7,2};
//		int[] b = {6,8,1,4,5};
//		
//		for (int i = 0; i < b.length; i++) {
//			
//			for (int j = 0; j < b.length; j++) {
//				
//				if (b[i]==a[j]) {
//					
//					System.out.println(b[i]);
//					
//				}
//			}
//		}
//		
		String input,res="";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enver a value: ");
		
		input = sc.nextLine();
		
		String a = input;
		
		int ln=input.length();
		
		for (int i = ln-1; i >= 0; i--) {
			
			res = res+input.charAt(i);
			
		}
		System.out.println(res);
		
		if (a.equalsIgnoreCase(res)) {
			
			System.out.println("Given String is Polyndrome");
		}
		else {
			System.out.println("Given String is Not Polyndrome");
		}
	}
	
	
	
	
	
}
