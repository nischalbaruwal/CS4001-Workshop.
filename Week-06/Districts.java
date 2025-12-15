import java.util.Scanner;

public class Districts {
    public static void main(String[] args) {

        String[] districts = {"Morang", "Kathmandu", "Kaski", "Sindhuli"};

        System.out.println("District List:");
        for (int i = 0; i < districts.length; i++) {
            System.out.println((i + 1) + ". " + districts[i]);
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter number of districts: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] newDistricts = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter district name " + (i + 1) + ": ");
            newDistricts[i] = sc.nextLine();
        }

        System.out.println("\nUpdated District List:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + newDistricts[i]);
        }

        sc.close();
    }
}

