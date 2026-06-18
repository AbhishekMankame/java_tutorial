public class StringBufer {
    public static void main(String a[]) {
        StringBuffer sb = new StringBuffer("Navin");

        // StringBuffer will have a string which is mutable. StringBuffer will give the buffer size of 16 bytes
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println();

        StringBuffer sb2 = new StringBuffer("Abhishek");
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());
        System.out.println();

        // StringBuffer will have buffer size of 16 bytes, even after intialization it will have that 16 bytes buffer (like 16 space extra), because everytime we change data, and if it consumes a continuous memory location inside your heap memory and what if there's no continuous location next available, aka there's no space available.
        // In that case, it has to relocate, relocation of the string gives you a buffer.

        sb2.append(" Mankame");
        System.out.println(sb2);

        // Note: We cannot assign string buffer to the string
        // String str = sb2; --> This would be a type mismatch 

        // To convert the stringBuffer to string, we need to use the 'toString()' method.

        String str = sb2.toString();
        System.out.println(str);

        // We can delete a character at the particular index
        sb.deleteCharAt(0);
        System.out.println(sb);

        sb.insert(0,"Java N");
        System.out.println(sb);

        // Note: stringBuffer is thread safe, and stringBuilder is not

    }
}