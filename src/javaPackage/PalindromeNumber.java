package javaPackage;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");

		int number = sc.nextInt();

		int originalNumber = number;
		int reversedNumber = 0;

		while (number != 0) {
			int digit = number % 10;
			reversedNumber = reversedNumber * 10 + digit;
			number /= 10;
		}
		
		if (originalNumber == reversedNumber) {
			System.out.println("Number is palindrome :");
		} else {
			System.out.println("Number is not Palindrome :");
		}

	}

}
