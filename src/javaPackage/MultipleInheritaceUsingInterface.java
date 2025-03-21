package javaPackage;

interface car
{
	void dzire();
	void baleno();
}

interface priceOfCar
{
	void dzirePrice();
	void balenoPrice();
}


public class MultipleInheritaceUsingInterface implements car,priceOfCar {

	public static void main(String[] args) 
	{
		MultipleInheritaceUsingInterface mi=new MultipleInheritaceUsingInterface();
		mi.baleno();
		mi.balenoPrice();
		mi.dzire();
		mi.dzirePrice();

	}

	
	public void dzirePrice() {
		// TODO Auto-generated method stub
		
		System.out.println("10 Lakh");
		
	}

	
	public void balenoPrice() {
		// TODO Auto-generated method stub
		System.out.println("13 Lakh");
	}

	
	public void dzire() {
		// TODO Auto-generated method stub
		
		System.out.println("This is dzire car: ");
	}

	@Override
	public void baleno() {
		// TODO Auto-generated method stub
		System.out.println("This is baleno car: ");
	}

}
