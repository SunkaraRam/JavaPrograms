package PracticeJava;

import java.util.Scanner;

public class AllPrograms {

	//Array Comparison
	/*
	public static boolean eq(int[] a , int[] b) {
		
		if(a.length!=b.length) return false;
	
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]!=b[i]) return false;
			
			
		}
		
		return true;
	
			
	}
	
	public static void main(String[] args) {
		
		
		int[] a = {1,5,6,3};
		
		int[] b = {1,5,6,3};
		
		int[] c = {2,5,6,8};
		
		int[] d = {3,9,8,7};
		
		System.out.println(eq(a,d));
		
	}
	
	
	*/
	
	//ArraySmallLarge Number Findout
	
	public static void main(String[] args) {
		
		
		int[] numberarray = new int[] {12,25,68,96,21};
		
		 int smallnum = numberarray[0];
		
		 int largenum = numberarray[0];
		
		for (int i = 0; i < numberarray.length; i++) {
			
			if (numberarray[i]>largenum) {
				
				largenum = numberarray[i];
				
			}
			
			else if (numberarray[i]<smallnum) {
				
				smallnum = numberarray[i];
				
			}
			
			
		}
		
		System.out.println("Large Number in Array : " +largenum );
		
		System.out.println("Large Number in Array : "+ smallnum );
		
		
		
		
		
	}
}
