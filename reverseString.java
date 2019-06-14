package PracticeCoding;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String one= "Hello";
String two="";
for(int i=one.length()-1;i>=0;i--) {
	two=two+one.charAt(i);
}
System.out.println(one);
System.out.println(two);
	}

}
