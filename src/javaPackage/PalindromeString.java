package javaPackage;

public class PalindromeString {

	public static void main(String[] args) {
		
		String str="adam";
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
		if(rev.equalsIgnoreCase(str))
		{
			System.out.println("String is PalindromeString: ");
		}
		else {
			System.out.println("String is not PalindromeString");
		}
	}

}
