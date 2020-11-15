package info.anastasiosarvanitis.java_examples;

public class Tableaudev {
	
	public static void afficheTableau2(int[] arr) {
			
			for (int j : arr) {
				
				System.out.printf("%d ", j);
			}
		}
	
	public static void afficheTableau3(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.print(arr[i]);
				if (i != arr.length-1) {
					System.out.print(",");
				} 
			}
			
		}
		System.out.println();
	}
	
	/** Printing the array with separator **/
	public static void afficheTableau(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length-1) {
				System.out.print(",");
			} 
		}
		System.out.println();
	}
	
	public static void initialise(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
	}
	
	/** Adding element only if there is no values, assuming no value equals 0  **/
	public static boolean ajouterElement(int[] arr, int element) {
		
		boolean isEmpty = false;
		
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 0) {
					isEmpty = true; 
					 arr[i] = element;
				 } else {
					 isEmpty = false;
				 }
			} 
		return isEmpty;
	}
	
	/** Adding elements to all the available spaces and printing it **/
	public static int[] remplir(int[] arr, int element) {
		
		for (int i = 0; i < arr.length; i++) {
			ajouterElement(arr, element);
		}
//		afficheTableau(arr);
		return arr;
	}
	
	public static boolean testRemplir(int[] arrOriginal, int[] arrRempli) {
		
		boolean isTheSame = false;
		
		for (int i = 0; i < arrOriginal.length; i++) {
			
			for (int j = 0; j < arrRempli.length; j++) {
				
				if (arrOriginal[i] != arrRempli[j]) {
					isTheSame = false;
				} else {
					isTheSame = true;
				}
			}
		}
		afficheTableau(arrOriginal);
		afficheTableau(arrRempli);
		return isTheSame;
//		
//		
		
	}

	public static void main(String[] args) {
		
//		int[] array1 = {1,5,12,58,96,78,10,21,34,89,78};
//		int[] array2 = new int[4];
		
		int[] array3 = {1,0,12,0};
//		System.out.println("array1");
//		remplir(array1, 100);
//		System.out.println();
//		System.out.println("array2");
//		remplir(array2, 100);
//		System.out.println();
//		System.out.println("array3");
//		remplir(array3, 80);
//		System.out.println();
		System.out.println(testRemplir(array3, remplir(array3, 2)));
		
//		afficheTableau3(array3);
	}

}
