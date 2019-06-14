package PracticeCoding;
import java.util.*;
public class primeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// prime number is a whole number greater than 1, which is only divisible by 1 and itself. First few prime numbers are : 
		//2 3 5 7 11 13 17 19 23
for(int i=0;i<=10;i++) {
	if(isPrime(i))
		System.out.println(i + " true");
	//else
		//System.out.println(i+ " false");
}
	}
static boolean isPrime(int n) {
	
	if(n<=1) {
		return false; 
	}
	for(int i=2;i<n;i++) {
		if(n%i==0) {
			return false;
		}
	}
	return true;

}
}
