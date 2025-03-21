package javaPackage;

public class ConstructorDemoChaining {

    String type;

    ConstructorDemoChaining(String type) {
        this.type = type;
    }
}

class ConstructorDemo1 extends ConstructorDemoChaining {

    String brand;
    int year;

    ConstructorDemo1(String brand, int year) {
        super("Car");
        this.brand = brand;
        this.year = year;
    }

    void display() {
        
        System.out.println("Type: " + type + ", Brand: " + brand + ", Year: " + year);
    }

    public static void main(String[] args) {
        ConstructorDemo1 con = new ConstructorDemo1("Toyota", 2025);
        con.display();
    }
}