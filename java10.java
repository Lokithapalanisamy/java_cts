import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int guess;
        
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
        
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            }
        } while (guess != secretNumber);
        
        System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
        
        scanner.close();
    }
}