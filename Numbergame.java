import java.util.Scanner;
import java.util.Random;
public class Numbergame
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int minNumber=1;
        int maxNumber=100;
        int randomNumber=r.nextInt(maxNumber-minNumber+1)+minNumber;
        int attempts=0;
        boolean hasGuessed=false;
        System.out.println("Welcome to the Number Game!");
        System.out.println("I've picked a number between"+minNumber + "and" +maxNumber + ". Try to guess it!");
        while(!hasGuessed)
        {
            System.out.println("Enter your guess:");
            int userGuess=sc.nextInt();
            attempts++;
            if(userGuess==randomNumber)
            {
                hasGuessed=true;
                System.out.println("Congratulations! You've guessed the number in"+attempts +"attempts.");
            }
            else if(userGuess<randomNumber)
            {
                System.out.println("Try a higher number.");
            }
            else
            {
                System.out.println("Try a lower number.");
            }

        }

    }
}