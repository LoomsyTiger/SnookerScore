import java.util.Scanner;

public class SnookerScoreTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter player 1 name: ");
        String player1Name = scanner.nextLine();

        System.out.println("Enter player 2 name: ");
        String player2Name = scanner.nextLine();

        SnookerGame snookerGame = new SnookerGame(player1Name, player2Name);

        while (true) {
            System.out.println("Enter player name (or 'quit' to end): ");
            String playerName = scanner.nextLine();

            if (playerName.equals("quit")) {
                break;
            }

            System.out.println("Enter points scored: ");
            int points = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            snookerGame.recordShot(playerName, points);
            snookerGame.displayScores();
        }

        scanner.close();
    }
}