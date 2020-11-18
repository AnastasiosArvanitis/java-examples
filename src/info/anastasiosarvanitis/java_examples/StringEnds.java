package info.anastasiosarvanitis.java_examples;

public class StringEnds {

	public static void main(String[] args) {
		
		System.out.println(checkEnding("Tasis", "s"));
	}
	
	public static boolean checkEnding(String str1, String str2) {
		if (str1.endsWith(str2)) {
			return true;
		} else {
			return false;
		}
	}

}
