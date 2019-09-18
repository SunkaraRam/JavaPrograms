package PracticeJava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileReader {
	
	static String line = null;
	
	public static void main(String[] args) {
		
		String filename="D:\\VinayaRam.txt";
		
		try {
			
			FileReader fr= new FileReader(filename);
			
			BufferedReader br = new BufferedReader(fr);
			
			while ((line=br.readLine())!=null) {
				
				System.out.println(line);
				
			}
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Unable to Open " +filename+"  File");
		}
		
		catch (IOException e) {
			
			System.out.println("Error reading file");
		
		}
		
		
		
	}

}
