import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        int guess;
        int number;
        int attempts = 0;
        String answer;
        boolean gameEnded = false;

        System.out.println("********************************");
        System.out.println("WELCOME TO NUMBER GUESSING GAME!");
        System.out.println("********************************");

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        number = random.nextInt(1, 101);

        while (!gameEnded){

            System.out.print("Guess your number (1-100): ");

            while (!scanner.hasNextInt()){
                System.out.println("Please enter a valid number.");
                System.out.print("Guess your number (1-100): ");
                scanner.next();
            }

            guess = scanner.nextInt();
            attempts++;

            if (guess < 1 || guess > 100){
                System.out.println("Please enter a number between 1 and 100.");
                continue;
            }

            if (guess < number){
                System.out.println("Too low! Try again.");
            } else if (guess > number) {
                System.out.println("Too high! Try again.");
            } else{
                System.out.println("********");
                System.out.println("YOU WON!");
                System.out.println("********");
                System.out.println("Attempts: " + attempts);

                System.out.print("Want to play again (y/n)?: ");

                String playAgain;
                while (true){
                    playAgain = scanner.next().trim();

                    if (playAgain.equalsIgnoreCase("n")){
                        gameEnded = true;
                        break;
                    } else if (playAgain.equalsIgnoreCase("y")){
                        attempts = 0;
                        number = random.nextInt(1, 101);
                        System.out.println("\nNew number generated!");
                        break;
                    } else{
                        System.out.println("Please enter a valid choice.");
                        System.out.print("Want to play again (y/n)?: ");
                    }
                }
            }
        }
        System.out.println("Thanks for playing!");
    }
}