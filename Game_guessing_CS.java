import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int totalScore = 0;
        String playAgain;

        do {
            int attempts = 0;
            int randomNumber = rand.nextInt(100) + 1;

            System.out.println("Guess a number between 1 and 100:");

            while (true) {
                int guess = input.nextInt();
                attempts++;

                if (guess == randomNumber) {
                    System.out.println("Congratulations! You guessed correctly.");
                    totalScore += 10 - attempts + 1;
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("Too low! Try again:");
                } else {
                    System.out.println("Too high! Try again:");
                }

                if (attempts >= 10) {
                    System.out.println("Sorry, you didn't guess the number. The number was " + randomNumber);
                    break;
                }
            }

            System.out.println("Your current score is: " + totalScore);
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = input.next();
        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Thank you for playing! Your final score is: " + totalScore);
        input.close();
    }
}
