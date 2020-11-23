import java.util.Scanner;

public class WhileLoopExample {

    public static void main(String[] args) {
       
        Scanner reader = new Scanner(System.in);
        System.out.print("How many times do you want to loop? ");

        
        int limit = reader.nextInt();
     
      //  System.out.println("I am going to loop: " + limit + " Times.");

        int i = 0;

        int sum = 0;

        while (i < limit) {
            i++; 
           // System.out.println("This is loop: " + i);       
            sum++;
            System.out.println ("Sum is: " + sum);
            
        }


//        System.out.println("HELLO WORLD!!!!!!");
    }
}