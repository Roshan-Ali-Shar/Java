import java.util.Scanner;
public class Basic_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, result;
        char operator;
        System.out.println("Welcome to the Calculator Program!");
        System.out.println("Please enter an expression       (e.g., 5 + 10):");     
        // Input: Read the expression as a string
        String expression = input.nextLine();
        // Parse the expression
        String[] tokens = expression.split(" ");
        if (tokens.length != 3) {
            System.out.println("Invalid input. Please provide an expression in the format 'number operator number'.");
            return;
        }
        // Parse the numbers and operator
        try {
            num1 = Double.parseDouble(tokens[0]);
            operator = tokens[1].charAt(0);
            num2 = Double.parseDouble(tokens[2]);
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            System.out.println("Invalid input. Please provide valid numbers and operator.");
            return;
        }
        // Perform the calculation based on the operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Division by zero is not allowed.");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator. Please use +, -, *, or /.");
                return;
        }
        System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
   	 }
	}
 
