package javaPackage;


class Parent
{
 
	int a=200;
  
}

class Child extends Parent
{
 
	int a=300;
	
	void display()
	{
		System.out.println(super.a);
	}
 
 }

public class SuperKeyword {

	public static void main(String[] args) {
		
		Child child=new Child();
		child.display();
		

	}

}
