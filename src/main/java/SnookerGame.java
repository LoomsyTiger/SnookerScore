import java.util.HashMap;
import java.util.Map;

public class SnookerGame {
    private Player player1;
    private Player player2;

    private Map<String, Integer> ballValues;

    public SnookerGame(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name);
        this.player2 = new Player(player2Name);

        // Initialize ball values
        ballValues = new HashMap<>();
        ballValues.put("red", 1);
        ballValues.put("yellow", 2);
        ballValues.put("green", 3);
        ballValues.put("brown", 4);
        ballValues.put("blue", 5);
        ballValues.put("pink", 6);
        ballValues.put("black", 7);
    }

    public void displayScores() {
        System.out.println(player1.getName() + ": " + player1.getScore());
        System.out.println(player2.getName() + ": " + player2.getScore());
    }

    public void displayRemainingScore() {
        System.out.println("Remaining score:");
        ballValues.forEach((ball, value) -> System.out.println(ball + ": " + value));
    }

    public void recordShot(String playerName, String ballPotted) {
        if (ballValues.containsKey(ballPotted)) {
            int points = ballValues.get(ballPotted);
            if (playerName.equals(player1.getName())) {
                player1.updateScore(points);
            } else if (playerName.equals(player2.getName())) {
                player2.updateScore(points);
            } else {
                System.out.println("Invalid player name.");
            }
        } else {
            System.out.println("Invalid ball type.");
        }
    }
}
