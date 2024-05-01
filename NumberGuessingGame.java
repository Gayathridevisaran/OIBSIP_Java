import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame
{
   public static void main(String args[])
   {
      Scanner scanner = new Scanner(System.in);
      Random random = new Random();
      int lowerBound = 1;
      int upperBound = 100;
      int generatedNumber = random.nextInt(upperBound - lowerBound + 1)+lowerBound;
      int maxAttempts = 5;
      int attempts = 0;
      int score = 100;
      System.out.println("Welcome to Guess the Number game!");
      System.out.println("I have selected a number between"+lowerBound+"and"+upperBound+".");
      while(attempts < maxAttempts)
      {
         System.out.println("Enter your guess:");
         int userGuess = scanner.nextInt();
         attempts++;

         if(userGuess == generatedNumber)
         {
            System.out.println("Congratulations! You guessed the number correctly in" +attempts + "attempts.");
            break;
         }
         else if(userGuess < generatedNumber)
         {
            System.out.println("The number is higher than" + userGuess + ".");
         }
         else 
         {
            System.out.println("The number is lower than" + userGuess + ".");
         }
         score -= 20;
      }
      if(attempts == maxAttempts)
      {
         System.out.println("Sorry,you've run out of attempts. The correct number was:" + generatedNumber);
      }
      System.out.println("Your final score is:" + score);
   }
}