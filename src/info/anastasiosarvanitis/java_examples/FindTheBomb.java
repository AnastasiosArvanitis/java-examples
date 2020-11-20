package info.anastasiosarvanitis.java_examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindTheBomb {

	public static void main(String[] args) {
		
		System.out.println( bomb("Telos PAPA Nounos BOMb"));

	}
	
	public static String bomb(String str) {
		boolean isBomb = false;
		final String duck = "DUCK!";
		final String relax = "Relax, there's no bomb.";
		
		String strLower = str.toLowerCase();
		
		Pattern pattern = Pattern.compile("bomb");
		Matcher matcher = pattern.matcher(strLower);
		
			if (matcher.find()) {
				isBomb = true;
			} 
		
		return isBomb ? duck : relax;
		
	}
	
	public static String bomb2(String str) {
		return str.toLowerCase().contains("bomb") ? "DUCK!" : "Relax, there's no bomb.";
	}

}
