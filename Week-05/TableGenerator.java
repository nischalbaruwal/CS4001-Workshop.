import java.util.Scanner;

class TableGenerator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println("\nMultiplication Table for " + num + ":");
        System.out.println("---------------------------");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        input.close();
    }
}
