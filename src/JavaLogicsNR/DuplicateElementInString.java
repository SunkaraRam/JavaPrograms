package JavaLogicsNR;

import java.util.HashMap;
import java.util.Set;

public class DuplicateElementInString {

	public static void main(String[] args) {
		
		String s1 = "web interface web driver web   browser";
		
		String[] words= s1.split(" ");	
		
		HashMap<String, Integer> wordmap = new HashMap<String, Integer>();
		
		for (String str:words) {
			
			if (wordmap.get(str)!=null) {
				
				wordmap.put(str, wordmap.get(str)+1);
				//System.out.println(wordmap.get(str));
				
			}
			else {
				wordmap.put(str, 1);
				//System.out.println(wordmap.get(str));
			}
		}
	
		Set<String>str2 = wordmap.keySet();
		
		for(String str1:words) {
	
			System.out.println("Words "+str1 +" repeated: "+wordmap.get(str1)+"time");
	
		}
	}
	
	

}
