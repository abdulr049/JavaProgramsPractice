package javaPackage;

import java.util.Scanner;

public class FactorialDemo {

	public static void main(String[] args) {
	
		int factorial=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for factorial: ");
		
		int num=sc.nextInt();
		
		for(int i=num;i>0;i--)
		{
			factorial=factorial*i;
		}

		System.out.println("Factorial of Number is :"+factorial);
	}

}
