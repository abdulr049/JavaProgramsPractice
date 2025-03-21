package javaPackage;

import java.util.Arrays;

public class ArraySortUsingLoop {

	public static void main(String[] args) {

		int[] numbers = { 2, 4, 1, 6, 3, 2, 9, 10, 5 };

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - 1 - i; j++) {
				if (numbers[j] > numbers[j + 1]) 
				{
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}

			}

		}

		System.out.println(Arrays.toString(numbers));

	}

}
