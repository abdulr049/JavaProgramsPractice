package javaPackage;

public class ReverseString {

	public static void main(String[] args) {

		// 1 method
		String str = "Abdul Rahman";
		char[] chatStr = str.toCharArray();

		String rev = "";

		for (int i = chatStr.length - 1; i >= 0; i--) {
			rev = rev+chatStr[i];

		}

		// 2 method
		
		System.out.println(rev);
		
		String str1="Ahan Khan s/o Abdul Rahaman";
		
		String revstr="";
		
		for(int i=str1.length()-1;i>=0;i--)
		{
			revstr=revstr+str1.charAt(i);
		}
		System.out.println(revstr);
	
	}

	
	}

