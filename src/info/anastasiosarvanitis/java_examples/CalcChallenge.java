package info.anastasiosarvanitis.java_examples;

public class CalcChallenge {

	public static void main(String[] args) {
		System.out.println(calculator(10, 'l', 10));

	}
	
	public static int calculator(int num1, char operator, int num2) {
		int result = 0;
		
		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '/':
			if (num2 == 0) {
				result = 0;
			} else {
				result = num1 / num2;
			}
			break;
		case '*':
			result = num1 * num2;
			break;
		default:
			break;
		}
		
		return result;
	}

}
