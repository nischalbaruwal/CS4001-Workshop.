import java.util.Scanner;

public class SimpleNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int[] scores = {10, 20, 30, 40, 50};

        System.out.println("Scores:");
        for (int i = 0; i < scores.length; i++)
        {
            System.out.println(scores[i]);
        }
        int sum = 0;
        for (int i = 0; i < scores.length; i++)
        {
            sum += scores[i];
        }
        System.out.println("The sum of all the elements is: " + sum);
        
        double average = (double) sum / scores.length;
        System.out.println("The average is: " + average);

        int highest = scores[0];
        int lowest = scores[0];

        for (int i = 0; i < scores.length; i++)
        {
            if (scores[i] > highest)
            {
                highest = scores[i];
            }

            if (scores[i] < lowest)
            {
                lowest = scores[i];
            }
        }

        System.out.println("The highest element is: " + highest);
        System.out.println("The lowest element is: " + lowest);

        sc.close();
    }
}
