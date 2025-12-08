import java.util.Scanner;
class SellingpriceCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double markedPrice;
        String category;
        double discountRate = 0.0;
        double discountAmount;
        double sellingPrice;
        System.out.println("Enter the marked price of the item:");
        markedPrice = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the category of the item:");
        category=sc.nextLine();
           switch (category){
            case "A":
                discountRate = 0.60; // 60%
                break;
            case "B":
                discountRate = 0.40; // 40%
                break;
            case "C":
                discountRate = 0.20; // 20%
                break;
            case "D":
                discountRate = 0.10; // 10%
                break;
            default:
                // Handles invalid input gracefully
                System.out.println("Invalid category entered. Discount cannot be calculated.");
                sc.close();
                return;
            }

        // 4. Calculate Discount and Selling Price
        discountAmount = markedPrice * discountRate;
        sellingPrice = markedPrice - discountAmount;

        // 5. Display Final Price
        System.out.println("\n--- Calculation Summary ---");
        System.out.println("Marked Price: NPR" + markedPrice);
        System.out.println("Category: " + category + " (" + (discountRate * 100) + "% Discount)");
        System.out.println("Discount Amount: NPR" + discountAmount);
        System.out.println("Final Selling Price: NPR" + sellingPrice);
        System.out.println("---------------------------");

        sc.close();
    }
}
