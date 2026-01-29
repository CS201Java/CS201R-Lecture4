import java.util.Scanner;
 
public class Main {

    public static void main (String[] args){

        //write a loop to sum the values from 1 to 10
        int sum = 0;
        for (int i = 1; i <=10; i++ ){
            sum += i;
        }
        System.out.println("\n\nSum from 1 to 10 is " + sum);

        //write a loop to sum the values from 20 to 37 inclusive

        //write a loop to sum the values from 35 to 49 inclusive


        //Checking some odd loops
        System.out.println("\n\nOdd Loop #1");

        for (int i = 0, j = 0; i + j < 10; ++i, ++j) {
            System.out.println(i + " " + j + " = " + (i + j));
        }
        System.out.println();
        System.out.println("\n\nOdd Loop #2");
        
        int j = 16;
        for (;j > 0; j /= 2){
            System.out.print(j + " ");
        }
        System.out.println();

        //
        //playing lottery            
        Scanner input = new Scanner(System.in);      
        Games.playLottery(input);

        //Play craps                
        Games.playCraps(input);

        //YOU DO IT
        Convert.binToDec(input);
        Convert.decToBin(input);



        //for each logic
        //Create an 1D Array of Suits & Cards
        String[] suits = {"Diamonds", "Hearts", "Spades", "Clubs"};
        String[] cards = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K"};
        //write a nested loops to print cards of suits




        //Create an 2D Array of Suits & Cards
        String[][] deck = new String[suits.length][cards.length];

        //write nested loop to print deck
        
        
        //Draw the Pyramid (2-d)    you do it #3
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
