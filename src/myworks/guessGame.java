import java.util.Random;
import java.util.Scanner;
public class guessGame {
    public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                Random rand = new Random();

                // Generate random number between 1 and 10
                int randomNumber = rand.nextInt(10) + 1;

                System.out.println("=== Number Guessing Game ===");
                System.out.print("Enter a number between 1 and 10: ");

                try {
                    int userGuess = sc.nextInt();

                    // Using if-else
                    if (userGuess == randomNumber) {
                        System.out.println("Correct! You guessed the number.");
                    } else if (userGuess < randomNumber) {
                        System.out.println("Too low! The number was: " + randomNumber);
                    } else {
                        System.out.println("Too high! The number was: " + randomNumber);
                    }

                } catch (Exception e) {
                    System.out.println(" Invalid input! Please enter a number.");
                }

                System.out.println("Game Over. Thanks for playing!");
                sc.close();
        }
    }
