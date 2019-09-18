package logicalprograms;

import java.util.HashSet;
import java.util.Set;

public class duplicateselementsinarray 
{
	public static void main(String[] args) 
	{
  String [] names= {"java","ruby","pyton","javascript","c","java","ruby"};
  Set<String>store=new HashSet<String>();
  
	for (String name : names) 
	{
	  if (store.add(name)==false) 
	  {
		System.out.println("duplicate elements is" +name);
	}	
	 }
      }
       }
