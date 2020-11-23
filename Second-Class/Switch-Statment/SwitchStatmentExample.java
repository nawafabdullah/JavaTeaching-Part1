import java.util.Scanner;

public class SwitchStatmentExample {

    public static void main(String[] args) {
        // Creates a reader instance which takes
        // input from standard input - keyboard
        Scanner reader = new Scanner(System.in);
        System.out.print("Please make a choice:\n 1. Apple\n 2. Banana \n 3. Cranberries\n 4. Durian\n");

        int userInput = reader.nextInt();

        switch (userInput) { 
            case 1:
                System.out.println("You chose Apple ");
                break;
            case 2: 
                System.out.println("You chose Banana " );
                break;
            case 3: 
                System.out.println("You chose Cranberries ");
                break;
            case 4:
                System.out.println("You chose Durian ");
                break;
            default: 
                System.out.println("You did not chose from the list");
            }      
    }
}