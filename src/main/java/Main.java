import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Players players = new Players();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name for player 1: ");
        String player1 = input.nextLine();
        System.out.println("Enter name for player 2: ");
        String player2 = input.nextLine();
        players.setPlayer1(player1);
        players.setPlayer2(player2);

        System.out.println("These players have been entered: ");
        System.out.println(players.getPlayerNames());
    }
}
