package PracticeCoding;

import java.util.ArrayList;
//Write a function that combines two lists by alternatingly taking elements. For example: given the two lists [a, b, c] and [1, 2, 3], the function should return [a, 1, b, 2, c, 3].
public class combinesTwoListAlternating {

	public static void main(String[] args) {
ArrayList <String> list1= new ArrayList();
ArrayList <String> list2= new ArrayList();
ArrayList <String> list3= new ArrayList();
list1.add("a");
list1.add("b");
list1.add("c");

list2.add("1");
list2.add("2");
list2.add("3");

for(int i=0;i<list1.size();i++) {
	list3.add(list1.get(i));
	list3.add(list2.get(i));

}
System.out.println(list3);
	}

}
