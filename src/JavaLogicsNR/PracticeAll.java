package JavaLogicsNR;

import java.util.Scanner;

public class PracticeAll {

	public static void main(String[] args) {
		
/*		int input;
		
		Scanner tk = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		
		input = tk.nextInt();
		
		int factorial=1;
		
		for (int i = input; i>0; i--) {
			
			factorial = factorial*i;
			
			input --;
			
		}
		
		System.out.println(factorial);
	
*/
		/*
		 * // fibonacci series
		 * 
		 * int input;
		 * 
		 * Scanner tk = new Scanner(System.in);
		 * 
		 * System.out.println("Enter Number : ");
		 * 
		 * input = tk.nextInt();
		 * 
		 * int f1,f2=0,f3=1;
		 * 
		 * for (int i = 0; i < input; i++) {
		 * 
		 * System.out.println(f3+" ");
		 * 
		 * f1=f2; f2=f3; f3=f1+f2;
		 * 
		 * }
		 */
		
	/*	 
	 *Polyndrome or not
	 * int input;
		  
		  Scanner tk = new Scanner(System.in);
		  
		  System.out.println("Enter Number : ");
		  
		  input = tk.nextInt();
		  
		  int res=0,rem,a;
		  
		  a = input;
		  
		  while (input>0) {
			
			  rem = input%10;
			  
			  res = res*10+rem;
			  
			  input = input/10;
		}
		  if (a==res) {
			
			  System.out.println("It is polyndrome");
			  
		}
		  else {
			  System.out.println("It is not polyndrome");}
	*/
		
		
		/*
		 * int rows = 5,k=0;
		 * 
		 * for (int i = 1; i <=rows; i++,k=0) {
		 * 
		 * for (int space = 0; space <= rows-i; space++) {
		 * 
		 * System.out.print("  "); } while (k!=2*i-1) {
		 * 
		 * System.out.print("* "); k++; } System.out.println(); }
		 
	  op: *   
        * * * 
      * * * * * 
    * * * * * * * 
  * * * * * * * * * 

		 *
		 *
		 *
		 *
		 */
		
		int input;
		
		Scanner tk = new Scanner(System.in);
		  
		  System.out.println("Enter Number : ");
		  
		  input = tk.nextInt();
		
		 for (int i = 2; i < input; i++) {
			
			 for (int j = 2; j < input; j++) {
				
				 if (i==j) {
					System.out.println(i);
				}
				 
				 if (i%j==0) {
					
					 break;
				}
			}
			 
		}
		  
				
	}
}