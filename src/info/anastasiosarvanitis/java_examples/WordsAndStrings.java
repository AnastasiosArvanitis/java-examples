package info.anastasiosarvanitis.java_examples;

import java.util.Random;

public class WordsAndStrings {
	
	public static int TirerNombreAleatoirement(int min, int max) {
		Random r = new Random();
		return r.nextInt(max - min);
	}
	
	public static void main(String[] args) {
		System.out.println(TirerNombreAleatoirement(10, 200)); 
	}
	
}
