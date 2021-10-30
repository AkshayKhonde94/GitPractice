package Basic1;

public class basicCalculator {

	public static void main(String[] args) {
		System.out.println(sum(12, 24));
		System.out.println(sub(12, 24));
		System.out.println(mult(12, 24));
		System.out.println(div(12, 24));

	}

	public static int sum(int num1, int num2) {

		return num1 + num2;
	}

	public static int sub(int num1, int num2) {

		return num1 - num2;
	}

	public static int mult(int num1, int num2) {

		return num1 * num2;
	}

	public static int div(int num1, int num2) {

		return num1 / num2;
	}
}
