import java.util.Scanner;

public class NepalTaxCalculatorSimple {

    public static void main(String[] args) {
        // Step 1: Get Income from User
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Nepal Income Tax Calculator ---");
        System.out.print("Enter Annual Income (NPR): ");
        
        double income = sc.nextDouble();
        double taxPayable = 0.0;
        double taxableAmount = income; // This is the amount we'll keep reducing

        System.out.println("\n--- Calculating Tax ---");

        // We check the highest rates first and work our way down.

        // 6. Income ABOVE 5,000,000 (39% rate)
        if (taxableAmount > 5000000.0) { 
            double tax = (taxableAmount - 5000000.0) * 0.39;
            taxPayable += tax;
            System.out.println("Tax on >50 Lakhs (39%): + NPR " + tax);
            taxableAmount = 5000000.0; // The remaining income is now capped at 50 Lakhs
        }

        // 5. Income from 2,000,001 to 5,000,000 (36% rate)
        if (taxableAmount > 2000000.0) {
            double tax = (taxableAmount - 2000000.0) * 0.36;
            taxPayable += tax;
            System.out.println("Tax on >20 Lakhs (36%): + NPR " + tax);
            taxableAmount = 2000000.0;
        }

        // 4. Income from 1,000,001 to 2,000,000 (30% rate)
        if (taxableAmount > 1000000.0) {
            double tax = (taxableAmount - 1000000.0) * 0.30;
            taxPayable += tax;
            System.out.println("Tax on >10 Lakhs (30%): + NPR " + tax);
            taxableAmount = 1000000.0;
        }

        // 3. Income from 7,00,001 to 1,000,000 (20% rate)
        if (taxableAmount > 700000.0) {
            double tax = (taxableAmount - 700000.0) * 0.20;
            taxPayable += tax;
            System.out.println("Tax on >7 Lakhs (20%): + NPR " + tax);
            taxableAmount = 700000.0;
        }

        // 2. Income from 5,00,001 to 7,00,000 (10% rate)
        if (taxableAmount > 500000.0) {
            double tax = (taxableAmount - 500000.0) * 0.10;
            taxPayable += tax;
            System.out.println("Tax on >5 Lakhs (10%): + NPR " + tax);
            taxableAmount = 500000.0;
        }

        // 1. Income up to 5,00,000 (1% rate)
        if (taxableAmount > 0) {
            double tax = taxableAmount * 0.01;
            taxPayable += tax;
            System.out.println("Tax on First 5 Lakhs (1%): + NPR " + tax);
        }

        // Step 3: Show Result
        System.out.println("----------------------------------------------");
        System.out.println("Total Tax Payable: NPR " + taxPayable); 
        System.out.println("----------------------------------------------");

        sc.close();
    }
}