import java.util.Scanner;

class GradeConversion{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the GPA : ");
        double gpa= sc.nextDouble();
        
        if(gpa < 0.0 || gpa > 4.0){
            System.out.println("please enter the gpa between 0.0 to 4.0");
        }
        
        String grade="";
        if(gpa <= 4 && gpa >=3.6){
            grade= "A+";
            
        }else if(gpa >= 3.2 && gpa < 3.6){
            grade="A";
        }else if(gpa >= 2.8 && gpa < 3.2){
            grade="B+";
        }else if(gpa >= 2.4 && gpa <2.8 ){
            grade="b";
        }else if(gpa >= 2.0 && gpa < 2.4){
            grade="C+";
        }else if(gpa >= 1.6 && gpa < 2.0){
            grade="C";
        }else if(gpa >= 1.0 && gpa < 1.6){
          grade="NG";
        }
        System.out.println("Your Grade: " +grade);
        
        
    }}
        