import java.util.Scanner;


public class IfConditionExample {

    public static void main(String[] args) {
        // Creates a reader instance which takes
        // input from standard input - keyboard
        Scanner reader = new Scanner(System.in);
        System.out.print("Please make a choice:\n 1. Apple\n 2. Banana \n 3. Cranberries\n 4. Durian\n");

        int userInput = reader.nextInt();

        if (userInput == 1) {
            System.out.println ("You Chose Apple");
        } 
        else if (userInput == 2) {
            System.out.println ("You Chose Banana");
        }
        else if (userInput == 3) {
            System.out.println ("You Chose Cranberries");
        }
        else if (userInput == 4) {
            System.out.println ("You Chose Durian");
        } 
        else {
            System.out.println ("input out of range");
        }   
    }
}