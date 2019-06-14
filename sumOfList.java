package PracticeCoding;

import java.util.ArrayList;
//Write three functions that compute the sum of the numbers in a given list using a for-loop, a while-loop, and recursion.
public class sumOfList {

	public static void main(String[] args) {
ArrayList<Integer> list = new ArrayList();
list.add(5);
list.add(5);
list.add(5);
list.add(5);
//addFor(list);
//addWhile(list);
System.out.println(addRecur(list,0));
	}
public static void addFor(ArrayList list) {
	int one=0;
		for(int i=0;i<list.size();i++) {
			 one = one + (int) list.get(i);
			 
		}
	System.out.println(one);
}
public static void addWhile(ArrayList list) {
	int one=0;
	int two=0;
	while(two<list.size()) {
		 one = one + (int) list.get(two);
two++;
	}
	System.out.println(one);
	
}
public static int addRecur(ArrayList <Integer> list,int index) {
if(index==list.size()) 
{
	return 0;
}else {
	 return list.get(index)+addRecur(list,index+1);
}
}
}