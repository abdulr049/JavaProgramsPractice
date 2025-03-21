package javaPackage;

public class DataConversion {

	public static void main(String[] args) {

		int intNumber = 20;

		double doubleNumber = (double) intNumber;
		System.out.println(doubleNumber);

		double doubleNuber1 = 30.5;
		float floatNumber = (float) doubleNuber1;

		System.out.println(floatNumber);

		long longNumber = (long) doubleNuber1;

		System.out.println(longNumber);
		
		String strNumber= "12342";
		
		int strnum= Integer.parseInt(strNumber);
		System.out.println(strnum);

	}

}
