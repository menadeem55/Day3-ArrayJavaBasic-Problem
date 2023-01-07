package com.bridgelabz.arrayhandling;

public class ReverseOrderArray {
	public static void main(String[] args) {

		// Initialize array
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// print array starting from first element
		System.out.println("Array Element:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// print array starting from last element
		System.out.println("Array in reverse Element:");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
