package info.anastasiosarvanitis.java_examples;

public class ReFormTheWord {

	public static void main(String[] args) {
		System.out.println(reform("good", "morning"));
	}
	
	public static String reform(String left, String right) {
		String result = left.concat(right);
		return result.substring(0, 1).toUpperCase() + result.substring(1);
	}

}
