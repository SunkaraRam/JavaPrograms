package PracticeJava;

import java.util.Scanner;

public class AreaOfCircle {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int radious;
		
		System.out.println("Enter the radious of circle : ");
		
		radious = in.nextInt();
		
		//Math.PI it is a constant value of the circle
		
		double area = Math.PI*radious*radious;
		
		System.out.println("Area of the Circle is : " + area);
		
		
	}

}
