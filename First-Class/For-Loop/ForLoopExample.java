import java.util.Scanner;

public class ForLoopExample {

    public static void main(String[] args) {

        // Creates a reader instance which takes
        // input from standard input - keyboard
        Scanner reader = new Scanner(System.in);
        System.out.print("How many times do you want to loop? ");

        // nextInt() reads the next integer from the keyboard
        int limit = reader.nextInt();
        // println() prints the following line to the output screen
        System.out.println("I am going to loop: " + limit + " Times.");

       // for (initialiaze iterator;         condition;           increment)

        //int j = 0;

        for (int j = 0; j < limit; j++) {
            System.out.println("This is loop: " + (j+1));
            System.out.println((j+1));
        }

        




/*  

        int i = 0; 
        i = i +1;
        //i++;
        System.out.println(i);
        i = i +1;
        System.out.println(i);
 
 */
    }
}