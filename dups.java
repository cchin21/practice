package PracticeCoding;

import java.util.Arrays;

public class dups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 5, 2, 3, 4, 4, 4, 5, 5 };
		int n = arr.length;
		Arrays.sort(arr);
		n = removeDups(arr, n);
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}
	}

	// Function to remove duplicate elements
	// This function returns new size of modified
	// array.
	// only works on sorted arrays, unique numbers are stored
	static int removeDups(int arr[], int n) {
		if (n == 0 || n == 1)
			return n;

		int j = 0;

		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1])
				arr[j++] = arr[i];
		}
		arr[j++] = arr[n - 1];

		return j;

	}

}
