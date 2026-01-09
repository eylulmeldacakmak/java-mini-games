import java.util.Scanner;
public class QuizGame {
    public static void main(String[] args) {

        String answer;
        int rights = 0;
        int wrongs = 0;

        String[] questions = {"1. What is the capital of France?",
                          "2. Which planet is known as the Red Planet?",
                          "3. Who wrote Romeo and Juliet?",
                          "4. What is the largest mammal in the world?",
                          "5. What is the boiling point of water in Celsius?",
                          "6. What is the chemical symbol for Gold?",
                          "7. Who painted the Mona Lisa?",
                          "8. Which continent has the most countries?",
                          "9. What language is primarily spoken in Brazil?",
                          "10. How many sides does a hexagon have?"};

        String[][] choices = {{"A) Madrid", "B) Rome", "C) Paris", "D) Berlin"},
            {"A) Venus", "B) Mars", "C) Jupiter", "D) Saturn"},
            {"A) William Wordsworth", "B) William Shakespeare", "C) Jane Austen", "D) Charles Dickens"},
            {"A) Elephant", "B) Giraffe", "C) Blue Whale", "D) Hippopotamus"},
            {"A) 100", "B) 0", "C) 50", "D) 212"},
            {"A) Gd", "B) Al", "C) Au", "D) Ag"},
            {"A) Michelangelo", "B) Vincent van Gogh", "C) Pablo Picasso", "D) Leonardo da Vinci"},
            {"A) Asia", "B) Africa", "C) Europe", "D) South America"},
            {"A) Spanish", "B) Portuguese", "C) French", "D) Italian"},
            {"A) 5", "B) 6", "C) 7", "D) 8"}};

        String[] answers = {"C", "B", "B", "C", "A", "C", "D", "B", "B", "B"};

        System.out.println("*********************");
        System.out.println("WELCOME TO QUIZ GAME!");
        System.out.println("*********************");

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            System.out.println(questions[i]);
            for (int j = 0; j < 4; j++){
                System.out.println(choices[i][j]);
            }

            boolean validAnswer = false;

                System.out.print("Your answer: ");
                answer = scanner.nextLine();

                if (answer.equalsIgnoreCase("A") || (answer.equalsIgnoreCase("B") ||
                        (answer.equalsIgnoreCase("C") || (answer.equalsIgnoreCase("D"))))) {
                    if (answer.equalsIgnoreCase(answers[i])) {
                        System.out.println("******");
                        System.out.println("RIGHT!");
                        System.out.println("******");
                        rights++;
                    } else {
                        System.out.println("******");
                        System.out.println("WRONG!");
                        System.out.println("******");
                        wrongs++;
                    }
                } else {
                    while (!validAnswer) {
                        System.out.println("Please provide a valid answer.");
                        System.out.print("Your answer: ");
                        answer = scanner.nextLine();
                        if (answer.equalsIgnoreCase("A") || (answer.equalsIgnoreCase("B") ||
                                (answer.equalsIgnoreCase("C") || (answer.equalsIgnoreCase("D"))))) {
                        validAnswer = true;
                        }
                    }
                    if (answer.equalsIgnoreCase(answers[i])) {
                        System.out.println("******");
                        System.out.println("RIGHT!");
                        System.out.println("******");
                        rights++;
                    } else {
                        System.out.println("******");
                        System.out.println("WRONG!");
                        System.out.println("******");
                        wrongs++;
                    }
                }

        }

        System.out.println("You answered " + rights + " question/s right, and answered " + wrongs + " question/s wrong.");
        System.out.println("Thanks for playing!");
    }

}