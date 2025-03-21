package javaPackage;


class Bank{
	
	double ROI()
	{
		return 0;
	}
	
}

class ICICI extends Bank
{
	double ROI()
	{
		return 10;
	}
}

class SBI
{
	double ROI()
	{
		return 10.5;
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		Bank bank=new Bank();
		System.out.println(bank.ROI());
		
		ICICI icici=new ICICI();
		System.out.println(icici.ROI());
		
		SBI sbi=new SBI();
		System.out.println(sbi.ROI());
		

	}

}
