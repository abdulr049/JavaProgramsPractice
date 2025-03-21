package javaPackage;

public class ThisKeyword {

	int x,y;
	
	void add(int x, int y)
	{
		this.x=x;
		this.y=y;		
	}
	
	void PrintNumber()
	{
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		
		ThisKeyword tk=new ThisKeyword();
		tk.add(200, 300);
		tk.PrintNumber();
		
	}
	
	
}
