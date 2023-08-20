import java.util.Random;
import java.util.Scanner;
public class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean wannaPlayAgain = true;
        int totalAttempts = 0;
        int roundsWon = 0;

        
        while (wannaPlayAgain) {
            int maximumNumber = 100;
            int randomNumber = random.nextInt(maximumNumber) + 2;

            int maximumAttempts = 3;
            int numberOfTries = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("Welcome to the Number Game!");
            System.out.println("You have to guess the number between 1 and " + maximumNumber);

            while (numberOfTries < maximumAttempts && !hasGuessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                numberOfTries++;
                totalAttempts++;

                
                if (userGuess == randomNumber) {
                    hasGuessedCorrectly = true;
                    System.out.println("Congratulations ! You guessed the correct number " + randomNumber + " " + "in" + " " + numberOfTries + " " + "tries.");
                    roundsWon++;
                }
                
                if (userGuess < randomNumber) {
                    System.out.println("Oops! Try a higher number.");
                }
                else if (userGuess > randomNumber) {
                    System.out.println("Oops! Try a lower number.");
                }


            }
            if (!hasGuessedCorrectly) {
                System.out.println("Sorry! You've reached the maximum number of attempts. The correct number was " + randomNumber + ".");
            }

            System.out.println("Do you want to play again? (Yes/No): ");
            String wannaPlayAgainInput = scanner.next();
            wannaPlayAgain = wannaPlayAgainInput.equalsIgnoreCase("yes");
        }
        scanner.close();
        System.out.println("Thank You for Playing!");
        System.out.println("Number of rounds won: " + roundsWon);
        System.out.println("Total Number of Attempts Taken: " + totalAttempts);
    }
}
