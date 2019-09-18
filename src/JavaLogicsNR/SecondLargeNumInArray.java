package JavaLogicsNR;

public class SecondLargeNumInArray {

	public static void main(String[] args) {
		
		/*
		 * int a[] ={1,2,3,4,5,56,55,6,7,8,9};
		 * 
		 * int temp;
		 * 
		 * for (int i = 0; i < a.length; i++) {
		 * 
		 * for (int j = 0; j < a.length; j++) {
		 * 
		 * if (a[i]>a[j]) {
		 * 
		 * temp=a[i]; a[i]=a[j]; a[j]=temp;
		 * 
		 * } }
		 * 
		 * } System.out.println("Second large number in array : "+a[a.length-2]);
		 */
		
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
