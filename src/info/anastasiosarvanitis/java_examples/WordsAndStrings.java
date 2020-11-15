package info.anastasiosarvanitis.java_examples;

import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WordsAndStrings {
	
	public static void afficheTableau(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			} 
		}
	
	/** Random number in a range **/
	public static int TirerNombreAleatoirement(int min, int max) {
		Random r = new Random();
		return r.nextInt(max - min);
	}
	
	
	/** find the word with the n position 
	 * @throws FileNotFoundException **/
	private static char[] tirerMotAleatoirement(int position) throws FileNotFoundException {
		String mot = "";
		File file = new File("./dictionnaire.txt");
		Scanner scan = new Scanner(file);
		
		for (int i = 0; i < position; i++) {
			mot = scan.nextLine();
		}
		
		char[] charArray = mot.toCharArray();
		scan.close();
		return charArray; 
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		//System.out.println(TirerNombreAleatoirement(10, 200)); 
		System.out.print(tirerMotAleatoirement(50));
		
	}
	
}
