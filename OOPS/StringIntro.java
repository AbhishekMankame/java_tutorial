// String in Java

class StringIntro {
    public static void main(String a[]) {
        String name = "Navin"; // Note: Here String datatype starts with capital letter, it is not a primitive datatype, it is an class
        String name1 = new String("Abhishek");

        System.out.println(name);
        System.out.println(name1);
        System.out.println(name.hashCode());

        // To concatenate string we can use '+' operator
        System.out.println("Hello " + name1);
        System.out.println(name.charAt(1));
        System.out.println(name1.charAt(0));
    }
}