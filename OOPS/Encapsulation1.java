class Human {
    private int age = 11; // Here this 'age' variable is accessible in the same class, no one from the outside world can use it
    private String name = "Navin";

    // Note: Everytime we create an instance variable, make it private. No one from the outside world should able to use it.\
    // The way they should be able to access the data with the help of methods

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

class Encapsulation1 {
    public static void main(String a[]) {
        Human obj = new Human();

        System.out.println(obj.getName());
        System.out.println(obj.getAge());

        obj.setAge(30);
        obj.SetName("Abhishek");
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}