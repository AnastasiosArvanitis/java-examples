package info.anastasiosarvanitis.java_examples;

public class SwappFirstLastName {

	public static void main(String[] args) {
		String test = "Tasos Berto";
		System.out.println(swappName(test));
		

	}
	
	public static String swappName(String s) {
		String firstName = s.substring(0, s.indexOf(" "));
		String lastName = s.substring(s.indexOf(" ")+1);
		String swapped = lastName +" "+ firstName;
		return swapped;
	}

}
