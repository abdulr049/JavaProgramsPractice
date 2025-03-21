package javaPackage;

import java.util.Scanner;

public class ExceptionalHandling {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		double num = sc.nextDouble();
		System.out.println(num);
		try {
			double c = 100 / num;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println("Enter the correct value: ");
		}
		int a[] = new int[5];
		System.out.println("Enter the possion of number: ");
		int pos = sc.nextInt();
		System.out.println("Position of value: " + pos);
		System.out.println("Enter the value");
		int value = sc.nextInt();
		try {
			System.out.println(a[pos] = value);
		} catch (Exception e) {
			System.out.println("Please provide the correct position: ");
			System.out.println(e.getMessage());
		}

	}

}
