package info.anastasiosarvanitis.java_examples;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String reverseString = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string to check if it is palindrome:");
		String inputString = scan.nextLine();
		
		int length = inputString.length();
		int i = length-1;
		
		while ( i >= 0 ) {
			reverseString = reverseString + inputString.charAt(i);
			i--;
		}
		
		if (inputString.equals(reverseString)) {
			System.out.println("Input string is a palindrome!");
		} else {
			System.out.println("Input string is not a palilndrome...");
		}
		
		scan.close();
		
	}

}
