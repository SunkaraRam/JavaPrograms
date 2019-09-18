package PracticeJava;

import java.util.Scanner;

public class DescendingOrder {

	static int n,temp;
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	
		n=sc.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter Multiple Values : ");
		for (int i = 0; i < n; i++) {
			
			a[i] = sc.nextInt();
			
		}
		
		for (int i = 0; i < n; i++) {

			for (int j = i+1; j < n; j++) {
				
				if (a[i]>a[j]) {
					
					temp=a[i];
					a[i] = a[j];
					a[j]=temp;
					
				}
				
			}
		}
		
		for (int i = 0; i <= n-1; i++) {
		
			System.out.println(a[i]+",");
		}
	}
	

}
