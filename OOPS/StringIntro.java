// String in Java

class StringIntro {
    public static void main(String a[]) {
        String name = "Navin"; // Note: Here String datatype starts with capital letter, it is not a primitive datatype, it is an class
        String name1 = new String("Abhishek");

        System.out.println(name);
        System.out.println(name1);
        System.out.println(name.hashCode());

        // hashCode() is a method that returns an integer hash value representing an object. It is mainly used by hash-based collections such as 'HashMap' and 'HashSet' to store and retrieve objects efficiently.
        // For a 'String', the hash code is calculated based on the characters in the string, so equal strings produce the same hash code.

        // To concatenate string we can use '+' operator
        System.out.println("Hello " + name1);
        System.out.println(name.concat(" Reddy"));
        System.out.println(name.charAt(1));
        System.out.println(name1.charAt(0));
    }
}