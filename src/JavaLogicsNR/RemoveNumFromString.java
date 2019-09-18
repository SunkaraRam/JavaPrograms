package JavaLogicsNR;

public class RemoveNumFromString {

	public static void main(String[] args) {
		
		ArmStrongDemo(153);
		
	
		}	
		
												//Method 1
		public static void alL12(String name) {
		  
		char[] words = name.toCharArray();
			
		  int n = words.length;
		  
		  String rev = "";
		  
		  int lowerletters=0;
		  
		  int upperletters = 0;
		  
		  int spaces=0;
		  
		  int digit = 0,specials=0;
				  
		  for (int i = 0; i < n; i++) {
		  
	  if (!Character.isDigit(words[i])) {
		  
		  rev = rev + words[i];
		  
		  }
		  
		if (Character.isLowerCase(words[i])) {
			
			  lowerletters ++;
			  
		}
		  if (Character.isUpperCase(words[i])) {
				
			  upperletters ++;
			  
		}
		  else if (Character.isSpace(words[i])) {
			
			  rev = rev+words[i];
			  
			  spaces ++;
			  
		}
		  
	 
		 
		  }
		  
		  System.out.println(rev);
		  
		  System.out.println("lowerletters count: " + lowerletters);
		  
		  System.out.println("upperletters count: "+ upperletters);
		
		  System.out.println("Spaces : " + spaces);
		  
		  System.out.println("Special Letters : " + specials);
		}		
		  
		  //Method 2

		public static void ALL_7(String name) {		
		
		char[] ch = name.toCharArray();

		int digits =0,letters = 0,spaces = 0,specials =0;
		
		for (int i = 0; i < ch.length; i++) {
			
			if (Character.isDigit(ch[i])) {
				
				digits++;
			}
			else if (Character.isLetter(ch[i])) {
				
				letters ++;
				
			}
			
			else if (Character.isSpace(ch[i])) {
				
				spaces ++;
				
			}
			
			else {
				specials ++;
			}
		}  
		  
		  System.out.println("Specials : " +specials);
		  
		  System.out.println("Digits : "+digits);
		  
		  System.out.println("Spaces : "+spaces);
		  
		  System.out.println("Letters : " + letters);
	}
		  
		  
		public static void Simple(String name) {
		
		System.out.println(" 'I have Used Replace Method' ");
			
		String name1 = name.replaceAll("[0-9]", "");
		
		System.out.println(name1);
	}
		
	public static void ArmStrongDemo(int Num) {
		
		
		int a = Num,rem = 0,res = 0;
		
		while (Num>0) {
			
			rem = Num%10;
			
			res = (int) (res+Math.pow(3,rem));
			
			
		}
		
		if (res == a) {
			
			System.out.println("Given Number is ArmStrong");
			
		}
		
		else {
			System.out.println("Given Number not is ArmStrong");
			
		}
		
	}

}
