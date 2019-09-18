package PracticeJava;

import java.util.Scanner;

public class Descending_Order {

	static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
	
	int n,temp;
	
	System.out.println("Enter no of elements you want : ");
	
	n = sc.nextInt();
	
	int a[] = new int[n];
	
	System.out.println("Enter Elements : ");
	
	for (int i = 0; i < n; i++) {

		a[i] = sc.nextInt();
		
	}
	
	for (int i = 0; i < n; i++) {
		
		for (int j =i+1; j < n; j++) 
		{
			
				if (a[i]>a[j]) 
				{
					
					temp = a[i];
					
					a[i]=a[j];
					
					a[j]=temp;
					
				}
				
		}
		
	}
	
	System.out.println("Numbers in Ascending Order : ");
	
	for (int i = 1; i <= n-1; i++) {
	
		System.out.println(a[i]+",");
	}
	System.out.println(a[n-1]);
	}

}
