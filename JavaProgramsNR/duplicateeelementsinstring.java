package logicalprograms;

import java.util.HashMap;
import java.util.Set;

public class duplicateeelementsinstring {

	public static void main(String[] args) 
	{
      String s1="web interface web driver web browser web";
      String [] words=s1.split(" ");
        HashMap<String, Integer>wordmap=new HashMap<String ,Integer>();
      for (String str : words) 
      {
		if (wordmap.get(str)!=null)
		{
			wordmap.put(str, wordmap.get(str)+1);
		}
		else 
		{
			 wordmap.put(str, 1);	
		}
	  }
      Set<String>str2=wordmap.keySet();
      for (String str1 : words) 
      {
    		System.out.println("words  "+str1 +"   repeated:  "+wordmap.get(str1)+"  time");
	}
 }
}
