package PracticeJava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FrFw {

	public static void main(String[] args) throws Throwable {
		
		String line;
		
		String file = "d://VinayaRam.txt";
		
		try {
		
		FileReader fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);//This is index of BufferedReader
				
			while ((line=br.readLine())!=null) {
				
				System.out.println(line);
			}
			
			
		} catch (Exception e) {

			System.out.println("File not found exception");// It will handle the checked exception
			
		}
		
	}

}
