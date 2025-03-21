package javaPackage;

public class SecondHigh {

	public static void main(String[] args) {
		
		int[] numbers= {2,4,6,8,3,2,1,9,10,5,14,11};
		
		int secondHigh=Integer.MIN_VALUE;
		int highestValue=Integer.MIN_VALUE;
		
		
		for(int i=0;i<numbers.length;i++)
		{
			
			if(numbers[i]>highestValue)
			{
				
				secondHigh=highestValue;
				highestValue=numbers[i];		
				
				
			}
			
			else if((numbers[i]>secondHigh)&&(numbers[i]<highestValue))
			{
				secondHigh=numbers[i];
			}
			
		}
		
		System.out.println(secondHigh);

	}

}
