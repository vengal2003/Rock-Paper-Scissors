import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Create a random object to generate the computer's choice
        Random random = new Random();
        
        // Possible choices
        String[] rps = {"rock", "paper", "scissors"};
        
        // Game loop (you can add exit condition if you like)
        while (true) {
            System.out.println("Enter rock, paper, or scissors (or type 'exit' to quit): ");
            String userChoice = scanner.nextLine().toLowerCase();
            
            // Exit the game if the user types 'exit'
            if (userChoice.equals("exit")) {
                System.out.println("Thanks for playing!");
                break;
            }

            // Validate user's choice
            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid choice! Please choose rock, paper, or scissors.");
                continue;
            }

            // Generate computer's choice
            int computerIndex = random.nextInt(3); // Random number between 0 and 2
            String computerChoice = rps[computerIndex];
            System.out.println("Computer chose: " + computerChoice);

            // Determine the winner
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                       (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                       (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
