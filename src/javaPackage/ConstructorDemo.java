package javaPackage;

public class ConstructorDemo {
	
	String brand;
	int year;


	ConstructorDemo()
	{
		 this.brand="Unknown"; this.year=0;
	}
	
	ConstructorDemo(String brand, int year)
	{
		this.brand=brand;
		this.year=year;
	}
	
	ConstructorDemo(String brand)
	{
		this(brand,2024);
	}
	
	void display()
	{
		System.out.println("Brand: " + brand + ", Year: " + year);
	}
	

	public static void main(String[] args) {
		
		ConstructorDemo conDemo=new ConstructorDemo();
		conDemo.display();
		
		ConstructorDemo conDemo1=new ConstructorDemo("Toyota", 2023);
		conDemo1.display();
		
		ConstructorDemo conDemo2=new ConstructorDemo("Tata");
		conDemo2.display();
	}

}
