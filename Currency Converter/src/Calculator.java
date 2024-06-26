import java.util.Scanner;

public class Calculator {
//    entry point for any Java program
    public static void main (String[] args) {

//        this will basically show the input to the user
        Scanner Calculator = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float Number1 = Calculator.nextFloat();
        System.out.println("Enter the operator (+, -, *, /): ");
        String operator = Calculator.nextLine().trim();
        System.out.println("Enter the second number: ");
        float num2 = Calculator.nextFloat();
        double result;
        if(operator.equals("+")){
            result = Number1 + num2;
        } else if (operator.equals("-")) {
            result = Number1 - num2;
        } else if (operator.equals("*")) {
            result = Number1 * num2;
        }
        else if (operator.equals("/")) {
            // Check for division by zero
            if (num2 == 0) {
                System.out.println("Error: Cannot divide by zero.");
                return;  // Exit the program if division by zero
            }
            result = Number1 / num2;
        }else {
            System.out.println("Invalid operator.");
            return;  // Exit the program for invalid operator
        }
        System.out.println("Result: " + Number1 + " " + operator + " " + num2 + " = " + result);

        Calculator.close();
        System.out.println("Enter the first number: ");
        double num1 = Calculator.nextDouble();

        // Get operator from user
        System.out.println("Enter the operator (+, -, *, /): ");
        String Operator = Calculator.nextLine();  // Read entire line to capture special characters like '-'

        // Get second number from user
        System.out.println("Enter the second number: ");
        double num2S = Calculator.nextDouble();

        double resultS;
        switch (Operator) {
            case "+":
                resultS = num1 + num2S;
                break;
            case "-":
                resultS = num1 - num2S;
                break;
            case "*":
                resultS = num1 * num2S;
                break;
            case "/":
                // Check for division by zero
                if (num2S == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                    return;  // Exit the program if division by zero
                }
                resultS = num1 / num2S;
                break;
            default:
                System.out.println("Invalid operator.");
                // Exit the program for invalid operator
                return;
        }
        System.out.println("Result: " + num1 + " " + Operator + " " + num2S + " = " + resultS);

        Calculator.close(); // Close Scanner to avoid resource leaks
    }
}
