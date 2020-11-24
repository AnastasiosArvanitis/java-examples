package info.anastasiosarvanitis.java_examples;

public class Discount {

	public static void main(String[] args) {
		System.out.println(discount(100, 25));
		System.out.println(discount(100, 50));
		System.out.println(discount(100, 5));
		System.out.println(discount(789, 13));
		System.out.println(discount(1500, 50));
		System.out.println(discount(89, 20));
		System.out.println(discount(100, 75));
	}
	
	public static double discount(int price, int percentage) {
		return (double)price - (double)price * (double)percentage / 100;
	}

}
