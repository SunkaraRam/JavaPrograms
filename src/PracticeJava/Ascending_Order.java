package PracticeJava;

import java.util.Scanner;

import sun.security.util.Length;

public class Ascending_Order {

	static int n,temp;
	
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter Array size : ");
		n = sc.nextInt();
		
		System.out.println("Enter "+n+" Elements :");
		
		int a[]=new int[n];
		
		
		for (int i = 0; i < n; i++) {
			
			a[i] = sc.nextInt();
			
		}
		
		for (int i = 0; i < n; i++) {
			
			for (int j = i+1; j < n; j++) {
				
				if (a[i]>a[j]) {
					
					temp=a[i];
					
					a[i]=a[j];
					
					a[j]=temp;
					
				}
				
			}
			
		}
		
		System.out.println("Ascending order is :");
				
		for (int i = 0; i <= n-1; i++) {
			
			System.out.println(a[i]+",");
		
		}
		
		
		for (int i = 0; i < a.length; i++) {
			
			
			for (int j = i+1; j < a.length; j++) {
			
				System.out.println(a[i] +" between Numbers :" +a[j] );
				for (int j2 = a[i]+1; j2 < a[j]; j2++) {
					
					System.out.println(j2);
				}
				break;
			}
		
		}
		
//		for (int c = 0; c < a.length; c++) {
//			
//			for (int d = c+1; d < a.length; d++) { 
//				
//				System.out.println(a[c] +" between Numbers :" +a[d] );
//				for (int j2 = a[c]+1; j2 < a[d]; j2++) {
//						System.out.println(j2);
//					}
//				
//			}
//			
//		}
		
//		System.out.println("First Element " + a[0]);
//		
//		System.out.println(a[0]+" Between Numbers  "+a[1]);
//		for (int i = a[0]+1; i <a[1]; i++) {
//			System.out.println(i);	
//		}
//		
//		System.out.println(a[1]+" Between Numbers  "+a[2]);
//		for (int i = a[1]+1; i <a[2]; i++) {
//			System.out.println(i);	
//		}
//		
//		System.out.println(a[2]+" Between Numbers  "+a[3]);
//		for (int i = a[2]+1; i <a[3]; i++) {
//			System.out.println(i);	
//		}
//		
//		System.out.println(a[3]+" Between Numbers  "+a[4]);
//		for (int i = a[3]+1; i <a[4]; i++) {
//			System.out.println(i);	
//		}

		
		
		}
	}
