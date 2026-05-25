public class LogicalOp {
    public static void main(String ar[]){
        int x = 5, y = 6;
        int a = 8, b = 10;
        System.out.println((x < y) && (a > b)); // Logical AND --> &&
        System.out.println((x < y) || (a > b)); // Logical OR --> ||
        System.out.println(!(x < y)); // Logical NOT --> !
        System.out.println((x < y) ^ (a > b)); // XOR

        // Let's learn about conditional statements
        System.out.println("Let's start with conditional statements");

        if(x > 10) {
            System.out.println("Hello");
        }
        else {
            System.out.println("Bye");
        }

        // Ternary Operator

        int n = 4;
        int result = 0;
        if(n%2==0)
            result = 10;
        else
            result = 20;

        System.out.println(result);
        
        int result2 = n%2!=0 ? 10 : 20;
        System.out.println(result2);
    } 
}