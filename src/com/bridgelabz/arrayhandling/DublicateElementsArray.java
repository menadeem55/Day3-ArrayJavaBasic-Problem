package com.bridgelabz.arrayhandling;

public class DublicateElementsArray {
	public static void main(String[] args) {
		// Initialize
		int[] array = new int[] { 4, 2, 3, 4, 2, 9, 8, 9, 3 };

		System.out.println("Duplicate elements:- ");

		// Searches for duplicate element
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j])
					System.out.print(array[j] + " ");
			}
		}

	}

}
