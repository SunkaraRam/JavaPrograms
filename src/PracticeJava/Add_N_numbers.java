package PracticeJava;

import java.util.Scanner;

public class Add_N_numbers {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n,temp=0;
		
		System.out.println("Enter the values of n : ");
		
		n = in.nextInt();
		
		for (int i = 0; i <=n; i++) {
			
			temp = temp+i;
		}
		
		System.out.println("The sum upto " +n + "is : " +temp);
		
	}
	
	/*
		int rem;
		
		int res=0;
		
		Scanner sc= new Scanner(System.in);
		
		n = sc.nextInt();

		while (n>0) {
			
			rem = n%10;

			res = res+rem;
			
			n=n/10;
		}
		
		System.out.println(res);
			
		}
		
		*/
}
	