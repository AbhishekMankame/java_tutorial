class Mobile {
    String brand;
    int price;
    static String name;

    static {
        name = "Phone";
        System.out.println("In static block");
    }

    // Static block is only called once, irrespective of how many objects we will create, we will call static block only once.

    public Mobile() {
        brand = "";
        price = 200;
        System.out.println("In constructor");
    }

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

}


public class StaticBlock {
    public static void main(String a[]) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.name = "SmartPhone";

        Mobile obj2 = new Mobile();

    }
}