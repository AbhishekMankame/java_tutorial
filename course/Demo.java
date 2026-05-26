// Let's learn about OOPS --> Object Oriented Programming System
class Calculator{
    public int add(int n1, int n2) {
        // System.out.println("in add");
        int r = n1 + n2;
        return r;
    }
}

public class Demo {
    public static void main(String args[]){
        int num1 = 4; // This is primitive variable
        int num2 = 5;

        Calculator calc = new Calculator();

        int result = calc.add(num1, num2);
        System.out.println(result);
    }
}