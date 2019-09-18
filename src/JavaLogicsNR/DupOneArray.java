package JavaLogicsNR;

public class DupOneArray {

	public static void main(String[] args) {
		
//		int[] a = new int[] {5,8,5,9,7,4,4};
//	
//		for (int i = 0; i < a.length; i++) {
//			
//			for (int j = i+1; j < a.length; j++) {
//				
//				if (a[i]==a[j]) {
//					
//					System.out.println(a[i]);
//					break;
//				}
//				
//				
//			}
//		}
	
	
		String[] name = new String[] {"jaya","Hare","jai","Ram","Pradeep","Sai","Ram"};
		
		for (int i = 0; i < name.length; i++) {
			
			for (int j = i+1; j < name.length; j++) {
				
				if (name[i].equals(name[j])) {
					
					System.out.println(name[i]);
				}
				
			}
			
		}
	
	
	
	}

}
