import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

    public static void printMove(String move) {
        switch (move.toLowerCase()) {
            case "rock":
                System.out.println(
                        """
                                    _______
                                ---'   ____)
                                      (_____)
                                      (_____)
                                      (____)
                                ---.__(___)"""
                );
                break;
            case "paper":
                System.out.println(
                        """
                                     _______
                                ---'    ____)____
                                           ______)
                                          _______)
                                         _______)
                                ---.__________)"""
                );
                break;
            case "scissors":
                System.out.println(
                        """
                                    _______
                                ---'   ____)____
                                          ______)
                                       __________)
                                      (____)
                                ---.__(___)"""
                );
                break;
            default:
                System.out.println("Unknown move");
        }
    }

    public static void main(String[] args) {

        String playerChoice = "";
        int compChoice;
        int wins = 0;
        int ties = 0;
        int loses = 0;
        String answer;
        boolean gameEnded = false;
        boolean validAnswer;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("************************************");
        System.out.println("WELCOME TO ROCK PAPER SCISSORS GAME!");
        System.out.println("************************************");

        while (!gameEnded){
            boolean validMove = false;
            while (!validMove) {
                System.out.print("Choose your move: ");
                playerChoice = scanner.nextLine();

                if (playerChoice.equalsIgnoreCase("Rock") ||
                        playerChoice.equalsIgnoreCase("Paper") ||
                        playerChoice.equalsIgnoreCase("Scissors")) {
                    validMove = true;
                } else {
                    System.out.println("Please enter a valid move.");
                }
            }

            System.out.println("You:");
            printMove(playerChoice);

            compChoice = random.nextInt(0, 3);

            String compMove = "";
            switch (compChoice) {
                case 0: compMove = "Rock"; break;
                case 1: compMove = "Paper"; break;
                case 2: compMove = "Scissors"; break;
            }

            System.out.println("Computer:");
            printMove(compMove);

            if (compChoice == 0) {
                System.out.println("Computer chose Rock!");
            } else if (compChoice == 1) {
                System.out.println("Computer chose Paper!");
            } else {
                System.out.println("Computer chose Scissors!");
            }

            if (playerChoice.equalsIgnoreCase("Rock")) {
                if (compChoice == 0){
                    System.out.println("****");
                    System.out.println("TIE!");
                    System.out.println("****");
                    ties++;
                } else if (compChoice == 1){
                    System.out.println("*********");
                    System.out.println("YOU LOSE!");
                    System.out.println("*********");
                    loses++;
                } else{
                    System.out.println("********");
                    System.out.println("YOU WIN!");
                    System.out.println("********");
                    wins++;
                }
            } else if (playerChoice.equalsIgnoreCase("Paper")) {
                if (compChoice == 0){
                    System.out.println("********");
                    System.out.println("YOU WIN!");
                    System.out.println("********");
                    wins++;
                } else if (compChoice == 1){
                    System.out.println("****");
                    System.out.println("TIE!");
                    System.out.println("****");
                    ties++;
                } else{
                    System.out.println("*********");
                    System.out.println("YOU LOSE!");
                    System.out.println("*********");
                    loses++;
                }
            } else if (playerChoice.equalsIgnoreCase("Scissors")) {
                if (compChoice == 0){
                    System.out.println("*********");
                    System.out.println("YOU LOSE!");
                    System.out.println("*********");
                    loses++;
                } else if (compChoice == 1){
                    System.out.println("********");
                    System.out.println("YOU WIN!");
                    System.out.println("********");
                    wins++;
                } else{
                    System.out.println("****");
                    System.out.println("TIE!");
                    System.out.println("****");
                    ties++;
                }
            }

            validAnswer = false;
            do {
                System.out.print("Want to play again (y/n)?: ");
                answer = scanner.nextLine().trim();

                if (answer.equalsIgnoreCase("y")) {
                    validAnswer = true;
                } else if (answer.equalsIgnoreCase("n")) {
                    gameEnded = true;
                    validAnswer = true;
                } else {
                    System.out.println("Please choose a valid choice.");
                }
            } while (!validAnswer);
        }

        System.out.println("Thanks for playing!");
        System.out.println("You have won " + wins + " times.");
        System.out.println("You had a tie " + ties + " times.");
        System.out.println("You have lost " + loses + " times.");
    }
}