import java.util.Scanner;

class SimpleCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        String operator = sc.next();

        double result = 0;

        switch (operator) {

            case "+":
                result = num1 + num2;
                break;

            case "-":
                result = num1 - num2;
                break;

            case "*":
                result = num1 * num2;
                break;

            case "/":
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                result = num1 / num2;
                break;

            default:
                System.out.println("Invalid operator! Please enter +, -, *, or /.");
                return;
        }

        System.out.println("The output of the two numbers is: " + result);
    }
}