package javaPackage;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		
		int a[]= {2,5,3,7,5,9,2,4};
		//int number=5;
		int count=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		boolean status=false;
		
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]==num)
			{
				count++;
				System.out.println("Number is found :" +count);
				
				status=true;
				
			}
			
		}
		
		System.out.print(count);
		if(status==false)
		System.out.println("Number is not found");
	}

}
