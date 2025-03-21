package javaPackage;

interface Shape
{
	void circle();
	
	default void rectangle()
	{
		System.out.println("This is the default method: ");
	}

	static void square()
	{
		System.out.println("This is the static method: ");
	}
}

public class InterfaceDemo implements Shape
{

	public static void main(String[] args) {
		
		InterfaceDemo interfacedemo=new InterfaceDemo();
		interfacedemo.rectangle();
		interfacedemo.circle();
		Shape.square();

	}
	
	public void circle() {
		System.out.println("This is abstract method: ");
		
	}

}
