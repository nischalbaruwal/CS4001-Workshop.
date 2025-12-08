import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean running = true;

        while (running) {

            System.out.print("Enter first number: ");
            double num1 = input.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = input.nextDouble();

            System.out.print("Choose operation (+, -, *, /): ");
            char op = input.next().charAt(0);

            double result = 0;

            if (op == '+') {
                result = num1 + num2;
            } else if (op == '-') {
                result = num1 - num2;
            } else if (op == '*') {
                result = num1 * num2;
            } else if (op == '/') {
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                    continue;
                }
                result = num1 / num2;
            } else {
                System.out.println("Invalid operator!");
                continue;
            }

            System.out.println("Result = " + result);

            System.out.print("Do you want to continue? (y/n): ");
            char choice = input.next().charAt(0);

            if (choice == 'n' || choice == 'N') {
                running = false;
            }
        }

        System.out.println("Calculator ended.");
        input.close();
    }
}

