import java.util.*;

public class Craps {
    private static final Random rand = new Random();

    private static int rollDice() {
        int die1 = 1 + rand.nextInt(6);
        int die2 = 1 + rand.nextInt(6);
        System.out.println("You rolled: " + die1 + " + " + die2 + " + " + (die1+die2));
        return die1 + die2;
    }

    public static void playCraps(Scanner scanner){
            System.out.println("\n\nWelcome to Craps!");
            int point = 0;
            int roll = rollDice();

            //add logic:
            //roll 7 or 11 win
            //roll 2,3,12 lose
            //other values roll point
 
 
            //add logic for point: roll until player gets point or rolls a 7
            // Rolling until player wins or loses
 
        }
}
