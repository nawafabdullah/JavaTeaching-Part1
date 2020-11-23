import java.util.Scanner;

public class DoWhileLoopExample {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("How many times do you want to loop? ");
        int limit = reader.nextInt();

        System.out.print("Now assign the iterator a number larger than the initial number: ");
        int iterator = reader.nextInt();
        int i = iterator;

        int j = 0;
        
        int sum = 10;
        
        System.out.println("I am going to try to loop: " + limit + " Times.");

        do {
           // System.out.println("This is loop: " + i);
            i++;

            //System.out.println ("Hello Maya");
            sum--;
            System.out.println ("Sum is: " + sum);
            
        
        }

        while (i < limit);

    }
}