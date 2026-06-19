class Mobile {
    String brand;
    int price;
    static String name;

    // Whenever we want to work with a non-static method, we need to create object of it
    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile obj) {
        System.out.println("In static method");
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }

    // We can use static variable in the static method, but we cannot use non-static variables inside static method
}


public class StaticMethod {
    public static void main(String a[]) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        obj2.name = "SmartPhone";

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
    }
}