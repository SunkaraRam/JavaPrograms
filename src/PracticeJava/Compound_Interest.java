package PracticeJava;

import java.util.Scanner;

public class Compound_Interest {
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		double Principle_Amount=0.0;
		
		double Compound_Interest=0.0;
		
		double Time_Period=0.0;
		
		double Interest_Rate = 0.0;
		
		System.out.println("Enter Principle Amount : ");
		
		Principle_Amount = in.nextDouble();
		
		System.out.println("Enter Time_Period : ");
		
		Time_Period = in.nextDouble();
		
		System.out.println("Enter Interest Rate : ");
		
		Interest_Rate = in.nextDouble();
	
		Compound_Interest = Principle_Amount * Math.pow((1 + Interest_Rate/100), Time_Period);
		
		System.out.println("");
		
		System.out.println(Compound_Interest);
	
	
	}

}
