import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Choose your move: Rock, Paper, or Scissors (or exit to end):");
            String playerMove = scanner.nextLine().toLowerCase();

            if (playerMove.equals("exit")) {
                System.out.println("Thanks for playing. Goodbye!");
                break;
            }

            if (!playerMove.equals("rock") && !playerMove.equals("paper") && !playerMove.equals("scissors")) {
                System.out.println("Invalid move. Please choose Rock, Paper, or Scissors.");
                continue;
            }

            int computerMoveIndex = random.nextInt(3); // 0 for Rock, 1 for Paper, 2 for Scissors
            String[] moves = {"rock", "paper", "scissors"};
            String computerMove = moves[computerMoveIndex];

            System.out.println("Computer chose: " + computerMove);

            // Determine the winner
            if (playerMove.equals(computerMove)) {
                System.out.println("It's a tie!");
            } else if (
                    (playerMove.equals("rock") && computerMove.equals("scissors")) ||
                            (playerMove.equals("paper") && computerMove.equals("rock")) ||
                            (playerMove.equals("scissors") && computerMove.equals("paper"))
            ) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }

        scanner.close();
    }
}
