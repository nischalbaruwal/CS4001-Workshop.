import java.util.Scanner;

class RickshawFare {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter distance (km): ");
 double distance = sc.nextDouble();

System.out.print("Enter time (minutes): ");
int time = sc.nextInt();

System.out.print("Is customer local? (yes/no): ");
boolean isLocal = sc.next().equalsIgnoreCase("yes") ? true : false;// ignore upper case or lower case

System.out.print("Is it night-time? (yes/no): ");
boolean isNight = sc.next().equalsIgnoreCase("yes") ? true : false;//ignore upper case or lower case

double base = 50;
double perKm = 20;
double perMin = 2;

double fare = base + (distance * perKm) + (time * perMin);

// Apply discount and surcharge without using if
fare *= (isLocal && distance > 5) ? 0.90 : 1.0;  // 10% discount if local
fare *= isNight ? 1.20 : 1.0;                    // 20% extra charge if night

System.out.println("Final Fare: Rs. " + (int)fare);
}
}