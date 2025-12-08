import java.util.Scanner;

class ScholarshipCheaker{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
         System.out.print("Enter GPA: ");
        double gpa = sc.nextDouble();

        System.out.print("Enter Attendance (%): ");
        double attendance = sc.nextDouble();

        System.out.print("Enter Attitude Score (1–10): ");
        int attitude = sc.nextInt();
        
        if(gpa >=3.2){
          if(attendance >=80){
            if(attitude >=6){
                    System.out.println("Student is eligible for scholarship.");
                } else {
                    System.out.println("Not eligible: Attitude score must be greater than or equal to 6.");
                }
            } else {
                System.out.println("Not eligible: Attendance must be more than 80%.");
            }
        } else {
            System.out.println("Not eligible: GPA must be at least 3.2.");
        }
    }
}
               