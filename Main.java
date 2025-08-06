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

        //write this one time and send the values
        sumValues(1,10);
        sumValues(20,37);
        sumValues(35,49);

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

        //using max function 
        //will determine which max function to use
        System.out.println("\n\nThe maximum of 30 and 54 is: " + (max(30,54)));
        System.out.println("The maximum of 3.0 and 5.4 is: " + (max(3.0,5.4)));
        System.out.println("The maximum of 30 and 5.4 is: " + (max(30,5.4)));
        System.out.println("The maximum of 30, 92 and 54 is: " + (max(max(30,92),54)));

        //pass by value
        int a = 10, b = 5;
        System.out.println("\n\na = " + a + " and b = " + b);
        swap (a,b);
	    System.out.println("a = " + a + " and b = " + b);

        //pass by reference using wrapper class
        IntWrapper c = new IntWrapper(10);
        IntWrapper d = new IntWrapper(5);
        System.out.println("\n\nc = " + c.value + " and d = " + d.value);
        swap (c,d);
        System.out.println("c = " + c.value + " and d = " + d.value);

        //pass by reference
        int[] arr1 = {1,2,3,4,5};
        printArray(arr1);
        swap (arr1);
        printArray(arr1);

        //Pyramid (2-d)
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of rows: ");
        int row = input.nextInt();
        System.out.println();
         
        for (int r = 0; r < row; r++){
            for (int co = 0; co < row - r; co++)
                System.out.print("  ");
            for (int e = 0; e <= r; e++){
                int value = (int)Math.pow(2,e);
                System.out.print(value + " ");
            }
            for (int e = r-1; e >= 0; e--){
                int value = (int)Math.pow(2,e);
                System.out.print(value + " ");
            }
            System.out.println();
        }

  
        //playing craps  

         
        Craps.playCraps(input);
        input.close();


    }

    public static void sumValues(int i1, int i2) {
        int result = 0;
        for (int i = i1; i <= i2; i++)
            result += i;

        System.out.println("\n\nThe sum of " + i1 + " and " + i2 + " is " + result);
    }


    /** Find the max of two integer values */
        public static int max(int num1, int num2) {
        System.out.println("max(int num1, int num2)");
        if (num1 > num2)
        return num1;
        else
        return num2;
    }
     
    /** Find the max of two double values */
    public static double max(double num1, double num2) {
        System.out.println("max(double num1, double num2)");
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    /** Find the max of two integer values */
    public static double max(int num1, double num2) {
        System.out.println("max(int num1, double num2)");
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    /** swap 2 integers */
    public static void swap(int x, int y) {
	    int temp = x;
	    x = y;
	    y = temp; 
    }

    static class IntWrapper{
        int value;
        IntWrapper(int v) {this.value = v;}
    }  

    /** swap 2 integers in wrapper class*/
    public static void swap(IntWrapper x, IntWrapper y) {
	    //IntWrapper temp = x;
	    int temp = x.value;
        x.value = y.value;
	    y.value = temp; 
    }

    /** swap 2 values in array */
    public static void swap(int[] arr) {
	    int temp = arr[0];
	    arr[0] = arr[arr.length - 1];
	    arr[arr.length - 1] = temp; 
    }

    
    /** print the array */
    public static void printArray(int[] arr) {
	    for (int i = 0; i < arr.length ; i++)
    	    System.out.print(arr[i] + " ");
        System.out.println();    
     
    }
}
