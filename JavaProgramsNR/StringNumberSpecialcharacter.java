package logicalprograms;
public class StringNumberSpecialcharacter 
{
	public static void main(String[] args) 
	{
	    String s1="abdkmfgm126763786!@#$%^&*()";
	    String s2="";
	    String res="";
	    int counter=0,num=0,syb=0,sum=0;
      
	    for (int i = 0; i < s1.length(); i++) 
	    {
		   if (Character.isLetter(s1.charAt(i))) 
		   {
			  counter++;
		   }else if (Character.isDigit(s1.charAt(i)))
		   {
			   num++;
			   res=res+s1.charAt(i);
			   s2=s2+s1.charAt(i);
			   sum=sum+Integer.parseInt(res);
		   }
		   else 
		   {
			   syb++;
		    }
		   }
	       System.out.println("number of characters="+counter);
	       System.out.println("number of digits="+ num);
	       System.out.println("number of digitvalues="+s2);
	       System.out.println("sum of values="+ sum);
	       System.out.println("number of  symboles="+syb);
	       System.out.println("length of the string="+ s1.length());
     	}
      }
