import java.util.Scanner;

class PostiveNegativeZeroChecker{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an integer to check if it is Postive, Negative or Zero");
        
        int number = sc.nextInt();
        
        System.out.println("----------------------------------------");

        // 2. Checks and displays if it is even or odd using % operator
        // The condition checks if the remainder of number / 2 is 0. and if it is 0 it is even otherwise it is odd
        if (number > 0) {
            System.out.println("The number " + number + " is  Postive number.");
        } else if (number < 0) {
            System.out.println("The number " + number + " is  Negative number.");
        }else{//if the number is not greater than 0 or not less than zero than it is zero number
            System.out.println("The number " + number + " is zero number .");
        
        System.out.println("----------------------------------------");
        
        sc.close();
    }
}
}
