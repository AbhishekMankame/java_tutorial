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

    // Note: Preference will always be given to the local variable
    // 'this' keyword represents the current object

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    // Constructor: Constructor looks like method itself, that means constructor will have a name, round brackets.
    // But the only change is for constructor we will not specify the return type

    public Human() {
        // System.out.println("In Constructor");
        age = 12;
        name = "John";
    }

    /*
    Note: Constructor has a same name as that of the class name.
    Constructor never returns anything.
    Just specify the access, which is public and then mention the name (Here it is 'Human')
    - Even if we do not call the constructor, it will be called
    Imp: Everytime we create the object, it will call the constructor
    
    */
}

class Encapsulation1 {
    public static void main(String a[]) {
        Human obj = new Human();
        // Human obj1 = new Human();

        System.out.println(obj.getName());
        System.out.println(obj.getAge());

        obj.setAge(30);
        obj.setName("Abhishek");
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}