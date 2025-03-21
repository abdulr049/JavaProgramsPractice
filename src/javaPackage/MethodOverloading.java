package javaPackage;

public class MethodOverloading {

	void m1() {
		System.out.println("Method 1");
	}

	int m1(int a) {
		return a;
	}

	int m1(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		MethodOverloading mo = new MethodOverloading();
		mo.m1();
		System.out.println(mo.m1(10));
		System.out.println(mo.m1(10, 30));

	}

}
