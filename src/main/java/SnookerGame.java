public class SnookerGame {
    private Player player1;
    private Player player2;

    public SnookerGame(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name);
        this.player2 = new Player(player2Name);
    }

    public void displayScores() {
        System.out.println(player1.getName() + ": " + player1.getScore());
        System.out.println(player2.getName() + ": " + player2.getScore());
    }

    public void recordShot(String playerName, int points) {
        if (playerName.equals(player1.getName())) {
            player1.updateScore(points);
        } else if (playerName.equals(player2.getName())) {
            player2.updateScore(points);
        } else {
            System.out.println("Invalid player name.");
        }
    }
}
