package javaPackage;

public class EncapsulationDemo {
	
	private int a=20;
	private int b=30;
	
	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}

	public void add()
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		EncapsulationDemo en=new EncapsulationDemo();
		en.add();

	}

}
