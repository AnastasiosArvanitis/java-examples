package info.anastasiosarvanitis.java_examples;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Give a phrase to count the numbers:");
		String input = scan.nextLine();
		int wordCount = input.split(" ").length;
		System.out.printf("The phrase has %s words", wordCount);
		scan.close();
	}

}
