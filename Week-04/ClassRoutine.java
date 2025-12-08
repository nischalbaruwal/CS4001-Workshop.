import java.util.Scanner;

public class ClassRoutine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day of the week");
        
        String day = sc.nextLine(); 
        
        String routine; // Variable to hold the routine string
        String header;  // Variable to hold the header-
           switch(day){
            case "sunday":
                header = "\n----------------- Routine for SUNDAY ------------------";
                routine = "Leature class - sunday\n" + 
                          "12:30 PM to 2:00 PM - Information system\n" + 
                          "2:30 PM to 4:00 PM - Logic and problem solving";
                break;
            case "monday":
                header = "\n----------------- Routine for MONDAY ------------------";
                routine = "Leature class - monday\n" + 
                          "8:00 AM to 9:30 AM - Computer hardware\n" + 
                          "10:30 AM to 12:00 AM - Programming";
                break;
                case "tuesday":
                header = "\n----------------- Routine for TUESDAY ------------------";
                routine = "Tutorial class - tuesday\n" + 
                          "8:00 AM to 9:30 AM - Logic and problem sloving\n" + 
                          "10:30 AM to 12:00 AM - Information system";
                break;
                case "wednesday":
                header = "\n----------------- Routine for WEDNESDAY ------------------";
                routine = "Tutorial class - wednesday\n" + 
                          "8:00 AM to 9:30 AM - Programming\n" + 
                          "10:30 AM to 12:00 AM - Computer hardware";
                break;
                case "thursday":
                header = "\n----------------- Routine for THURSDAY ------------------";
                routine = "Workshop class - thursday\n" + 
                          "8:00 AM to 9:30 AM - Logic and problem sloving\n" + 
                          "10:30 AM to 12:00 AM - Information system";
                break;
                case "friday":
                header = "\n----------------- Routine for FRIDAY ------------------";
                routine = "Workshop class - friday\n" + 
                          "12:30 PM to 2:00 AM - Programming\n" + 
                          "2:30 PM to 4:00 PM - Computer hardware";
                break;
            
            case "saturday":
                header = "\n----------------- Routine for SATURDAY ------------------";
                routine = "No classes! Enjoy your weekend.";
                break;
                
            default:
                header = "";
                routine = "Invalid input: Please enter a valid day (e.g., Monday) or 'all day'.";
                break; 
        }

        // Display the result
        System.out.println(header);
        System.out.println(routine);
        
    
    }
}