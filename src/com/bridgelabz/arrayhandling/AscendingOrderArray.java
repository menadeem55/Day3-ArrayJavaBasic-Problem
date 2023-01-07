package com.bridgelabz.arrayhandling;

public class AscendingOrderArray {

	public static void main(String[] args) {

		// Initialize array
		int[] array = new int[] { 7, 2, 1, 9, 7, 4, 2, 6, 4, 8 };
		int temp = 0;

		// Display elements of original array
		System.out.println("Element of original array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		// Sort the array in acceding order
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("");

		// Display elements of array after sorting
		System.out.println("Elements of array sorted in ascending order: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
