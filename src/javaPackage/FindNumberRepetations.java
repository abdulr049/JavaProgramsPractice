package javaPackage;

import java.util.Scanner;

public class FindNumberRepetations {

	public static void main(String[] args) {
		
		int a[]= {3,2,5,12,65,4,7,7,2,2,2,7,3,3,7};
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the repetations:");
		int num=sc.nextInt();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				count++;
			}
		}
		System.out.println("Count of occurence number:"+count);
	}

}
