package PracticeCoding;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number=6;


System.out.println(factorial(number));
	}
static int factorial(int n) {
	if(n==0) {
		return 1;
	}
	return n*factorial(n-1);
}
}
