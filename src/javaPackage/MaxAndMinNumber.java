package javaPackage;

public class MaxAndMinNumber {

	public static void main(String[] args) {

		int a[] = { 5, 2, 3, 7, 125, 9, 13, 4, 15, 6 };
		
		int max=a[0];
		int min=a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max);
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
	}
	

}
