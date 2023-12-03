import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SnookerGame {
    int pointsRemaining = 147;
    int player1score = 0;
    int player2score = 0;
    int breakingPlayer;
    Map<String, Integer> ballValues = new TreeMap<String, Integer>();

    public SnookerGame(){
        ballValues.put("Red", 1);
        ballValues.put("Yellow", 2);
        ballValues.put("Green", 3);
        ballValues.put("Brown", 4);
        ballValues.put("Blue", 5);
        ballValues.put("Pink", 6);
        ballValues.put("Black", 7);
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Who will break?");
        System.out.println("1. Player 1");
        System.out.println("2. Player 2");

        int choice;
        while (true) {
            System.out.println("Enter your choice (1 or 2): ");
            if(scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice == 1 || choice == 2) {
                    breakingPlayer = choice;
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                }
            } else {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next();
                }
            }
        }
    public void keepScore() {
        Scanner scanner = new Scanner(System.in);
        int totalBallsPotted = 0;

        while (pointsRemaining > 0) {
            System.out.println("Enter ball for player " + breakingPlayer);
            String pottedBall = scanner.nextLine();

            int ballScore = ballValues.get(pottedBall);
            System.out.println("Scored "+ballScore+"points");
            totalBallsPotted = totalBallsPotted + 1;
            player1score = player1score + ballScore;
            pointsRemaining = pointsRemaining - ballScore;

            System.out.println("Player "+breakingPlayer+" has "+player1score+" points. "+pointsRemaining+" points remaining.");
        }
    }

    }
