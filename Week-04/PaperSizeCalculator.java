import java.util.Scanner;

public class PaperSizeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String size;
        String dimensionsMM;
        String dimensionsInch;

        System.out.println("Enter the paper size (from A0 to A5):");
        size = sc.nextLine(); 

        // Use switch-case to determine dimensions
        switch (size) {
            case "A0":
                dimensionsMM = "841 x 1189 mm";
                dimensionsInch = "33.1 x 46.8 inches";
                break;
            case "A1":
                dimensionsMM = "594 x 841 mm";
                dimensionsInch = "23.4 x 33.1 inches";
                break;
            case "A2":
                dimensionsMM = "420 x 594 mm";
                dimensionsInch = "16.5 x 23.4 inches";
                break;
            case "A3":
                dimensionsMM = "297 x 420 mm";
                dimensionsInch = "11.7 x 16.5 inches";
                break;
            case "A4":
                dimensionsMM = "210 x 297 mm";
                dimensionsInch = "8.3 x 11.7 inches";
                break;
            case "A5":
                dimensionsMM = "148 x 210 mm";
                dimensionsInch = "5.8 x 8.3 inches";
                break;
            default:
                // Handle invalid input
                dimensionsMM = "Error: Invalid paper size entered.";
                dimensionsInch = "Please enter a size from A0 to A5.";
                break;
        }

        // Display the results
        System.out.println("\n--- Dimensions for " + size + " ---");
        System.out.println("Millimeters (mm): " + dimensionsMM);
        System.out.println("Inches (in):      " + dimensionsInch);
        System.out.println("--------------------------");
        
        sc.close();
    }
}