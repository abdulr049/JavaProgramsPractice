package javaPackage;

public class FeboncciSeries {

	public static void main(String[] args) {
		
		int n1=0; int n2=1; int sum=0;
		
		System.out.print(n1+""+n2);
		
		for(int i =2;i<=10;i++)
		{
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.print(sum);
		}
	
		
	}

}
