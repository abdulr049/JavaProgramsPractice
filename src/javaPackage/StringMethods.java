package javaPackage;

public class StringMethods {

	public static void main(String[] args) {
		
		String s1="Welcome to Automation";
		String s2="Welcome";
		System.out.println(s1.length());
		
		System.out.println(s1.concat(" ").concat(s2));
		
		System.out.println(s1.contains("Wel"));
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals("Welcome"));
		
		System.out.println(s2.equalsIgnoreCase("welcome"));
		
		
	
		

	}

}
