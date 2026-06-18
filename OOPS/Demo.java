class Calculator
{
    // int an; // we can create variable like this
    public int add(int num1, int num2){
        int r = num1 + num2;
        System.out.println("in add");
        return r;
    }
}

public class Demo {
    public static void main(String a[]){
        int num1 = 4;
        int num2 = 5;

        int result = num1 + num2;
        System.out.println(result);
        Calculator calc = new Calculator();
        int res = calc.add(num1,num2);
        System.out.println(res);

    }
}