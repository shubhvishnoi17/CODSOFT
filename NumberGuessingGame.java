import java.util.Random;
import java.util.Scanner;

public class SimpleGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int playAgain; // Foe controling the replay
        do {
            int numberToGuess = random.nextInt(100) + 1; // Random number between 1 to 100
            int guess;
            int attempts = 0;
            int maxAttempts = 5;
            boolean isGuessed = false;

            System.out.println("Guess the number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.println("Congratulations! You guessed it right in " + attempts + " attempts.");
                    isGuessed = true;
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (!isGuessed) {
                System.out.println("Sorry! You ran out of attempts. The number was " + numberToGuess);
            }

            System.out.print("Do you want to play again? (1 = Yes, 0 = No): ");
            playAgain = scanner.nextInt();

        } while (playAgain == 1);

        System.out.println("Thanks For Playing!");
        scanner.close();
    }
}

is this code looks like it is written by human
