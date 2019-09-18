package JavaLogicsNR;

public class RemoveSpecialInString {

	public static void main(String[] args) {
		
		String name = "fasdr+d-*/eteacxvxhtryg!@#$%";
		
		name=  name.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(name);
	
	}

}
