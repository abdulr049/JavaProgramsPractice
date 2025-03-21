package javaPackage;

public class SecondHighestNumber {

	public static void main(String[] args) {
		
		int[] array= {1,3,90,1,65,67,34,32,78};
		
		int highestNumber=Integer.MIN_VALUE;
		int secondHighestNumber=Integer.MIN_VALUE;
		
		//int highestNumber=0;
		//int secondHighestNumber=0;
		
		int size=array.length;
		
		for(int i=0;i<size;i++)
		{
			if(array[i]>highestNumber)
			{
				secondHighestNumber=highestNumber;	
				highestNumber=array[i];
				
							
			}
			
			else if(array[i]>secondHighestNumber && array[i]< highestNumber)
			{
				secondHighestNumber=array[i];
			}
		}
		
		System.out.println(secondHighestNumber);

	}

}
