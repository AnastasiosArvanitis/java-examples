package info.anastasiosarvanitis.java_examples;

public class MaximumTab {
	
	public static int maxTab(int[] tab) {
		int maxValue = tab[0];
		
		for (int i = 1; i < tab.length; i++) {
			if(tab[i] > maxValue) {
				maxValue = tab[i];
			}
		}
		return maxValue;
		
	}

	public static void main(String[] args) {
		
		int[] array = {1,5,12,58,96,78,10,21,34,89,78};
		System.out.printf("the max number is: %d", maxTab(array)); 
	}

}

