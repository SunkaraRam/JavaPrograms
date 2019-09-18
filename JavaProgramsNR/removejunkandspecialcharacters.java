package logicalprograms;

public class removejunkandspecialcharacters {

	public static void main(String[] args) 
	{
	  String name="gnfgrg54509929NJFOFSNLK1!@@#$%^&&*";
	  name=name.replaceAll("[^a-zA-Z0-9]", "");
	  System.out.println(name);

	}

}
