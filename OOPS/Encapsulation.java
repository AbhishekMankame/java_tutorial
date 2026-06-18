class Human {
    private int age = 11; // Here this 'age' variable is accessible in the same class, no one from the outside world can use it
    private String name = "Navin";

    // Note: Everytime we create an instance variable, make it private. No one from the outside world should able to use it.\
    // The way they should be able to access the data with the help of methods

    public int getAge() {
        return age; // Here we can access the age variable inside a method of a same class
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public void SetName(String n) {
        name = n;
    }

}

class Encapsulation {
    public static void main(String a[]) {
        Human obj = new Human();
        // obj.age = 11;
        // obj.name = "Navin";

        System.out.println(obj.getName());
        System.out.println(obj.getAge());

        obj.setAge(30);
        obj.SetName("Abhishek");
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}