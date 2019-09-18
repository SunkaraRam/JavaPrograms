package JavaLogicsNR;

import java.util.Scanner;

public class ArmStrongD {

	public static void main(String[] args) {
		
		int n,a,r,c=0;
		
		Scanner tk = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		
		n = tk.nextInt();
		
		a=n;
		
		while (n>0) {
			
			r= n%10;
			
			c=c+(r*r*r);
			
			n = n/10;
		}
	
		if (a==c) {
			System.out.println("It is ArmStrong Number");
		} else {

			System.out.println("It is not ArmStrong Number");
		}
		
	}
	
	

}
