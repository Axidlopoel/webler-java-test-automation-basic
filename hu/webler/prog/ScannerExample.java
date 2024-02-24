package hu.webler.prog;

import java.util.Random;
import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter your name: ");
        String name = scanner.next();
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println("Welcome, " + name + "!");

        boolean playAgain = true;
        while (playAgain) {
            int userGuess;
            int pcGuess;

            // Generate random number for PC
            pcGuess = random.nextInt(10) + 1; // Random number between 1 and 10

            System.out.print("Guess a number between 1 and 10 (or enter 0 to exit): ");
            userGuess = scanner.nextInt();

            if (userGuess == 0) {
                System.out.println("Thank you for playing, " + name + "!");
                break;
            }

            if (userGuess == pcGuess) {
                System.out.println("Congratulation, " + name + "! You guessed the number (" + pcGuess + ") correctly");
            } else {
                System.out.println("Sorry, " + name + "! The correct number was " + pcGuess + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = scanner.next();

            if (playAgainResponse.equalsIgnoreCase("no")) {
                System.out.println("Thank you for playing with us, bye bye!");
                playAgain = false;
            }
            /*if (!playAgainResponse.equalsIgnoreCase("yes")) {
                System.out.println("Thank you for playing with us, bye bye!");
                playAgain = false;
            }*/
            /*if (playAgainResponse.equalsIgnoreCase("yes")) {
                playAgain = true;
            } else {
                playAgain = false;
            }*/
        }
    }
}
