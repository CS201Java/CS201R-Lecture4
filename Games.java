import java.util.*;

public class Games {
    private static final Random rand = new Random();

    //PRE: none
    //POST: print the die rolled, the sum and return the result
    private static int rollDice() {
        //roll 2 die
        //print & return result 
        return 0;
    }

    //PRE:  accepts the scanner input
    //POST: generates a random value between 10 & 99
    //      asks the user for a 2 digit number
    //      compares the values 
    //          If the user input matches the lottery number in the exact order, the award is $10,000.
    //          If the digits in the user input match both digits in the lottery number, the award is $3,000.
    //          If one digit in the user input matches a digit in the lottery number, the award is $1,000.

    public static void playLottery(Scanner scanner){
            System.out.println("\n\nWelcome to My Lottery Game!");
 
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
