package javaPackage;

public class StaticKeyword {

	static int a = 10;
	int b = 40;
	int c = 20;

	public static void m1() {
		System.out.println("This is static method");
	}

	void m2() {
		System.out.println("This is non static method");
	}

	void m3() {
		m1();
		m2();
		System.out.println(a);
		System.out.println(b);

	}

	public static void main(String[] args) {

		System.out.println(a);
		m1();// accessible without creating object of class because this is static method.
		StaticKeyword sk = new StaticKeyword();
		sk.m2();
		sk.m3();

		// m2();

	}

}
