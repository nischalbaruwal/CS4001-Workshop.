
import java.util.Scanner;

/**
 * Write a description of class GradeEvaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeEvaluator
{
    public static void main(String[] args)
    { 
        Scanner sc= new Scanner(System.in);
        System.out.println("===== Grade report =====");
        
        System.out.println("Enter the grade");
        double grade1 = sc.nextDouble();
        String result1= (grade1 >=20) ? "pass" : "fail";
        System.out.println(result1);
        
        System.out.println("Enter grade again");
        double grade2 = sc.nextDouble();
        String result2= (grade2 >=20) ? "pass" : "fail";
        System.out.println(result2);
        
                
    }
}