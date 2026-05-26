// Note: This is part of a Udemy Java course exercise

public class Calculator {
    public static void main(String args[]){

        // Predefined values
        double num1 = 7;
        double num2 = 3;
        char operator = '+';

        // Loop control variable
        String again = "y";

        // Run calculator
        while(again.equals("y")){
            if(operator == '+'){
                System.out.println("Result: " + (num1 + num2));
            }
            else if(operator == '-'){
                System.out.println("Result: " + (num1 - num2));
            }
            else if(operator == '*'){
                System.out.println("Result: " + (num1 * num2));
            }
            else if(operator == '/'){
                if(num2 == 0) System.out.println("Cannot divide by zero.");
                else System.out.println("Result: " + (num1/num2));
            }
            else {
                System.out.println("Invalid operator.");
            }

            // End loop after first run
            again = "n";
        }
        // Closing message
        System.out.println("Thank you for using the calculator.");
    }
}