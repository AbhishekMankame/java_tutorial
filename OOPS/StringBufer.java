public class StringBufer {
    public static void main(String a[]) {
        StringBuffer sb = new StringBuffer();

        // StringBuffer will have a string which is mutable. StringBuffer will give the buffer size of 16 bytes
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println();

        StringBuffer sb2 = new StringBuffer("Abhishek");
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());
        System.out.println();

    }
}