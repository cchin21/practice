package PracticeCoding;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
String a="bob";
String b = "";

//System.out.println("Enter a string for palindrome checking");
//a=input.nextLine();
for (int i=a.length()-1;i>=0;i--) {
	b=b+a.charAt(i);
}
System.out.println(b);
if(b.equals(a)){
	System.out.println("is a palindrome");
}
else {
	System.out.println("is not a palindrome");
}
	}

}
