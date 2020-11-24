package info.anastasiosarvanitis.java_examples;

public class EqualityOfThreeValues {

	public static void main(String[] args) {
		System.out.println(countEquality(3, 4, 3)); 
		System.out.println(countEquality(1, 1, 1));
		System.out.println(countEquality(3, 4, 1));
		System.out.println(countEquality(4, 3, 3));
		System.out.println(countEquality(3, 3, 9));
	}
	
	/*
	 * equal(3, 4, 3) ➞ 2

	equal(1, 1, 1) ➞ 3

	equal(3, 4, 1) ➞ 0
	 * */
	
	public static int countEquality(int a, int b, int c) {
		int counter = 0;
		
		if ((a == c) && (b == c)) {
			counter = 3;
		} else if ((a == c) && !(b == c)) {
			counter = 2;
		} else if ((a == b) && !(b == c)) {
			counter = 2;
		} else if (!(a == b) && (b == c)) {
			counter = 2;
		} else {
			counter = 0;
		}
		
		return counter;
	}

}
