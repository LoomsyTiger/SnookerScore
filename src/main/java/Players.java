public class Players {
    String player1;
    String player2;

    String setPlayer1(String name) {
        player1 = name;
        return player1;
    }

    String setPlayer2(String name) {
        player2 = name;
        return player2;
    }

    String getPlayerNames() {
        return  player1 + " " + player2;
    }
}
