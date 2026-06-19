class Mobile {
    String brand; // These are instance variable
    int price;
    static String name; // By making it 'static' we are making this 'name' variable common to all the object

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class staticKeyword {
    public static void main(String a[]) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        obj2.name = "SmartPhone";

        obj1.name = "Phone"; // Here the 'name' will change for all the objects, as static variable is shared by all the objects

        // Note: Static variable need to call with their class name, we can also call it with the object name, but it is recommended to call with the class name
        // Static variables are shared by different objects, and if we want to refer the static variable, we can use a class name.
        // There is a different area in 'JVM' where we have all the static variables
        // In non-static methods you can use static variables, there is no harm.


        Mobile.name = "SmartPhone";
        obj1.show();
        obj2.show();
    }
}