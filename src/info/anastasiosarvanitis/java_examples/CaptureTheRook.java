package info.anastasiosarvanitis.java_examples;

public class CaptureTheRook {

	public static void main(String[] args) {
		
		String[] arr1 = {"A8", "E8"};
		String[] arr2 = {"A1", "B2"};
		
		System.out.println(canCapture(arr1));
		System.out.println(canCapture(arr2));

	}
	
	/**
	 * Write a function that returns true if two rooks 
	 * can attack each other, and false otherwise.
	 * canCapture(["A8", "E8"]) ➞ true
	 * canCapture(["A1", "B2"]) ➞ false
	 * **/
	
	public static boolean canCapture(String[] rooks) {
		if (rooks[0].charAt(0) == rooks[1].charAt(0) || rooks[0].charAt(1) == rooks[1].charAt(1)) {
			return true;
		} else {
			return false;
		}
	}

}
