import java.util.Scanner;
 
public class Main {

    public static void main (String[] args){

        //write this 3 times>>
        int sum = 0;
        for (int i = 1; i <= 10; i++)
            sum += i;
        System.out.println("\n\nSum from 1 to 10 is " + sum);
        sum = 0;
        for (int i = 20; i <= 37; i++)
            sum += i;
        System.out.println("Sum from 20 to 37 is " + sum);
        sum = 0;
        for (int i = 35; i <= 49; i++)
            sum += i;
        System.out.println("Sum from 35 to 49 is " + sum);

        //Checking some odd loops
        for (int i = 0, j = 0; i + j < 10; i++, j++) {
            System.out.println(i + " " + j + " = " + (i + j));
        }
        System.out.println();
        int j = 16;
        for (;j > 0; j /= 2){
            System.out.print(j + " ");
        }
        System.out.println();

        //you do it #1
        //playing craps  
        Scanner input = new Scanner(System.in);      
        Craps.playCraps(input);


        //for each logic
        //Create an 1D Array of Suits & Cards
        String[] suits = {"Diamonds", "Hearts", "Spades", "Clubs"};
        String[] cards = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K"};
        for (String s : suits){
            for (String ca : cards){
                System.out.print(ca + " of " + s + ", ");
            }
            System.out.println();
        }

        //Create an 2D Array of Suits & Cards
        String[][] deck = new String[suits.length][cards.length];

        for (int i = 0; i < suits.length; i++) {
            for (int k = 0; k < cards.length; k++) {
                deck[i][k] =  cards[k] + " of " +  suits[i];
            }
        }
        // Print the deck (optional)
        for (int i = 0; i < suits.length; i++) {
            for (int k = 0; k < cards.length; k++) {
                System.out.print(deck[i][k] + ", ");
            }
            System.out.println();
        }

        //Pyramid (2-d)
        //you do it #2
 
        System.out.print("Please enter the number of rows: ");
        int row = input.nextInt();
        System.out.println();
         
        for (int r = 0; r < row; r++){
            //loop to print spaces
 
            //loop to print *   
 
            System.out.println();
        }
        input.close();
    }

}
