package PracticeCoding;

public class Right {
	public static void main(String[] args) {

		int one = 3;
		int two = 5;

		rightPoint(one, two);
	}

	// This method takes in two ints for the multiples of testing
	static void rightPoint(int one, int two) {
		
	// test case 1: results up to 15 should follow as.....
		// 1, 2, right, 4, point, right, 7, 8, right, point, 11, right, 13, 14, rightpoint
		
		// loop for 100 times
		
		String sOne = "right";
		String sTwo= "point";
		String sThree="rightpoint";
		for (int i = 1; i <= 100; i++) {

			// if number is divisible by both inputs4
			// print right point instead of int i

			if (i % one == 0 && i % two == 0) {
				System.out.println(sThree);
				// if number is divisible by the first int, this case 5
				// print right instead of int i
			} else if (i % one == 0) {
				System.out.println(sOne);
				// if number is divisble by the second int, this case 5
				// print point instead of int i
			} else if (i % two == 0) {
				System.out.println(sTwo);
			} else {
				System.out.println(i);
			}

		}
		//Big O (N), single for loop
	}
}
