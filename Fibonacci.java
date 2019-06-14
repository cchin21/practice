package PracticeCoding;

public class Fibonacci {

	public static void main(String[] args) {
		// Fibonacci numbers By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two. As an example, here are the first 10 Fibonnaci numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, and 34.
		int one = 0;
		int two = 1;
		int three = 0;
		System.out.println(one);
		System.out.println(two);

		for (int i = 0; i <= 16; i++) {

			three = one + two;
			System.out.println(three);
			one = two;
			two = three;
		}
	}

}
