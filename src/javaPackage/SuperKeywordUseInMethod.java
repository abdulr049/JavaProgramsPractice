package javaPackage;


class Parent1
{
	int a=200;
	void parentMethod()
	{
		System.out.println("Multiplication: " +(a*a));
	}
	
}

class Child1 extends Parent1
{
	int a=200;
	void parentMethod()
	{
		System.out.println("Multiplication: " +(a+a));
		
		super.parentMethod();
	}
	
}

public class SuperKeywordUseInMethod {

	public static void main(String[] args) {
		
		Child1 child=new Child1();
		child.parentMethod();

	}

}
