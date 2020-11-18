package info.anastasiosarvanitis.java_examples;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println(reverseSting("Hello Baby!!"));

	}
	
	public static String reverseSting(String str) {
		char[] copyStr = str.toCharArray();
		char tmp;
		int i = 0;
		int j = copyStr.length-1;
		
		while (i < j) {
			tmp = copyStr[i];
			copyStr[i] = copyStr[j];
			copyStr[j] = tmp;
			i++;
			j--;
		}
		String newStr = new String(copyStr);
		return newStr;
	}

}
