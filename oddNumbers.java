package PracticeCoding;

import java.util.ArrayList;
import java.util.List;

public class oddNumbers {

	public static void main(String[] args) {
System.out.println(oddNumbers(96,97));
	}
	static List<Integer> oddNumbers(int l, int r) {
		ArrayList list = new ArrayList();

		while(l<=r) {
		    if(l%2!=0){
		        list.add(l);
		    }
		    l++;
		}
		return list;

		    }
}
