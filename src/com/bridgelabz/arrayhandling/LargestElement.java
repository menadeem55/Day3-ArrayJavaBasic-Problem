package com.bridgelabz.arrayhandling;

public class LargestElement {

	public static void main(String[] args) {

		int[] array = new int[] { 25, 50, 75, 82, 100,107 };
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}
		System.out.println("Largest Element present in given array: " + max);
	}

}
