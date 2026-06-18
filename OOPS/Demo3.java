class Calculator2 {
    public int add(int n1, int n2){
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }

    public double add(double n1, double n2){
        return n1 + n2;
    }
}


public class Demo3 {
    public static void main(String a[]){
        Calculator2 obj = new Calculator2();
        int r1 = obj.add(3,4);
        System.out.println(r1);
        int r2 = obj.add(5,4,3);
        System.out.println(r2);
        System.out.println(obj.add(3.453, 5.432));
    }
}

/*
Method Overloading:
Method overloading in Java means defining multiple methods with the same name in the same class, but with different parameters (different number, type, or order of parameters).

Method overloading allows a class to have more than one method with the same name, as long as their parameter lists are different.

*/