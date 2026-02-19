import java.util.Scanner;
void main() {

    Scanner in = new Scanner(System.in);
    String PlayerA, PlayerB;
    boolean validMove;
    String playAgain;

    do {  // Play-again loop

        // Player A input
        validMove = false;
        do {
            System.out.println("Pick one Player A: (R, P, S): ");
            PlayerA = in.next();
            PlayerA = PlayerA.toUpperCase();
            if (PlayerA.equals("R") || PlayerA.equals("P") || PlayerA.equals("S")) {
                validMove = true;
            } else {
                System.out.println("Invalid move, try again!");
            }
        } while (!validMove);

        // Player B input
        validMove = false;
        do {
            System.out.println("Pick one Player B: (R, P, S): ");
            PlayerB = in.next();
            PlayerB = PlayerB.toUpperCase();
            if (PlayerB.equals("R") || PlayerB.equals("P")|| PlayerB.equals("S")) {
                validMove = true;
            } else {
                System.out.println("Invalid move, try again!");
            }
        } while (!validMove);

        // Determine winner
        if (PlayerA.equals(PlayerB)) {
            System.out.println(PlayerA + " vs " + PlayerB + " → It's a Tie!");
        } else if (PlayerA.equals("R") && PlayerB.equals("S")) {
            System.out.println("Rock breaks Scissors → Player A wins!");
        } else if (PlayerA.equals("R") && PlayerB.equals("P")) {
            System.out.println("Paper covers Rock → Player B wins!");
        } else if (PlayerA.equals("P") && PlayerB.equals("R")) {
            System.out.println("Paper covers Rock → Player A wins!");
        } else if (PlayerA.equals("P") && PlayerB.equals("S")) {
            System.out.println("Scissors cuts Paper → Player B wins!");
        } else if (PlayerA.equals("S") && PlayerB.equals("P")) {
            System.out.println("Scissors cuts Paper → Player A wins!");
        } else if (PlayerA.equals("S") && PlayerB.equals("R")) {
            System.out.println("Rock breaks Scissors → Player B wins!");
        }

        // Play again prompt
        System.out.println("Play again? (Y/N): ");
        playAgain = in.next();
        playAgain = playAgain.toUpperCase();

    } while (playAgain.equals("Y"));
}

