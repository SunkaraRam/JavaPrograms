package JavaLogicsNR;

public class MissingNumInArray {

	public static void main(String[] args) {
		
		int[] list = {1,2,3,4,5,7,8,9};
		int sum=0;
		for (int i = 0; i < list.length; i++) {
			
			sum = sum+list[i];
		}
		
		System.out.println(sum);
		
		int sum1=0;
		for (int j = 1; j <=9; j++) {
			
			sum1 = sum1+j;
		}
		System.out.println(sum1);
		
		System.out.println(sum1-sum);
	
	}

}
