import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        // Creates a reader instance which takes
        // input from standard input - keyboard
        Scanner reader = new Scanner(System.in);

        System.out.println ("Please enter your name: ");
        String name = reader.nextLine();
        // println() prints the following line to the output screen
        
        System.out.println ("Hello " + name + "\n I hope that you will enjoy the lesson :)");
 
    }
}