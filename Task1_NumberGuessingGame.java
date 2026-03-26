import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;
        char playAgain;

        do {
            int number = rand.nextInt(100) + 1; // random number 1-100
            int attempts = 0;
            int maxAttempts = 5;
            boolean guessed = false;

            System.out.println("\n=== Number Guessing Game ===");
            System.out.println("Guess the number between 1 and 100");
            System.out.println("You have " + maxAttempts + " attempts");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();

                attempts++;

                if (guess == number) {
                    System.out.println("Correct! You guessed the number.");
                    guessed = true;
                    score++;
                    break;
                } 
                else if (guess > number) {
                    System.out.println("Too High!");
                } 
                else {
                    System.out.println("Too Low!");
                }

                System.out.println("Attempts left: " + (maxAttempts - attempts));
            }

            if (!guessed) {
                System.out.println("You lost! The correct number was: " + number);
            }

            System.out.println("Current Score: " + score);

            System.out.print("Do you want to play again? (y/n): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'y' || playAgain == 'Y');

        System.out.println("Final Score: " + score);
        System.out.println("Thanks for playing!");

        sc.close();
    }
}
