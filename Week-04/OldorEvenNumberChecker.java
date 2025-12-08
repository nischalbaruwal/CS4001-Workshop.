import java.util.Scanner;

class OldorEvenNumberChecker{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an integer to check if it is odd or even");
        
        int number = sc.nextInt();
        
        System.out.println("----------------------------------------");

        // 2. Checks and displays if it is even or odd using % operator
        // The condition checks if the remainder of number / 2 is 0. and if it is 0 it is even otherwise it is odd
        if (number % 2 == 0) {
            System.out.println("The number " + number + " is an EVEN number.");
        } else {
            System.out.println("The number " + number + " is an ODD number.");
        }
        
        System.out.println("----------------------------------------");
        
        sc.close();
    }
}
