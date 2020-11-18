package info.anastasiosarvanitis.java_examples;

public class CountTrue {

	public static void main(String[] args) {
		
		boolean[] booArr = {true, true, false, true, false, true};
		System.out.println(countTrue(booArr));

	}
	
	public static int countTrue(boolean[] arr) {
		int counter = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == true) {
				counter++;
			}
		}
		
		return counter;
	}

}
