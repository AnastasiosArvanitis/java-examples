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
	
	public static void remplir(int[] arr, int element) {
		
		for (int i = 0; i < arr.length; i++) {
			ajouterElement(arr, element);
		}
		afficheTableau(arr);
	}

	public static void main(String[] args) {
		
		int[] array1 = {1,5,12,58,96,78,10,21,34,89,78};
		int[] array2 = new int[4];
		int[] array3 = {1,0,12,0};
		System.out.println("array1");
		remplir(array1, 100);
		System.out.println();
		System.out.println("array2");
		remplir(array2, 100);
		System.out.println();
		System.out.println("array3");
		remplir(array3, 80);
		
//		afficheTableau3(array3);
	}

}
