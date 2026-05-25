public class LogicalOp {
    public static void main(String ar[]){
        int x = 5, y = 6;
        int a = 8, b = 10;
        System.out.println((x < y) && (a > b)); // Logical AND --> &&
        System.out.println((x < y) || (a > b)); // Logical OR --> ||
        System.out.println(!(x < y)); // Logical NOT --> !
        System.out.println((x < y) ^ (a > b)); // XOR
    } 
}