package info.anastasiosarvanitis.java_examples;

public class RockPaperScissors {

	public static void main(String[] args) {
		System.out.println(rps("scissors", "scissors"));
	}
	
	public static String rps(String s1, String s2) {
		String pl1Wins = "Player 1 wins";
		String pl2Wins = "Player 2 wins";
		String tie = "TIE";
		
		if ((s1.equals("rock") && s2.equals("scissors")) ||
				(s1.equals("paper") && s2.equals("rock")) || 
				(s1.equals("scissors") && s2.equals("paper"))) {
			return pl1Wins; 
		} else if ((s2.equals("rock") && s1.equals("scissors")) ||
				(s2.equals("paper") && s1.equals("rock")) || 
				(s2.equals("scissors") && s1.equals("paper"))) {
			return pl2Wins; 
		} else {
			return tie;
		}
		
	}
	
}
