package javaPackage;

public class CountOfCharOccurence {

	public static void main(String[] args) {

		String s = "Welcome to Automation";

		char stringChar = 'o';
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == stringChar) {
				count++;
			}	
		}
		
		System.out.println("Count occurence of char:" + count);
	}

}
