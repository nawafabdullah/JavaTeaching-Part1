// Demostrate Variable's Scopes inside functions and the use of return
// Return as a success indicator, if error occurs return will not happen
// Parameter passing 

import java.nio.file.FileSystem;
import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class Functions {

    public static void main(String[] args) {
        int firstNum = GetUserInput();
        int sumInMain = AddFunction(firstNum); 
        int subInmain = SubFunction(sumInMain);  
    }
    
































    
    public static int GetUserInput() {
        System.out.println ("================== Inside Get User Input Function ======================");
        Scanner reader = new Scanner(System.in);
    
        System.out.println ("First Number: ");
        int firstNum = reader.nextInt();
        System.out.println ("\nyou passed the values " + firstNum);
        
        return firstNum;
    }



    public static int AddFunction(int hadeelAdd) {
        System.out.println ("================== Inside Add Function ======================");
        System.out.println ("\nyou passed the values " + hadeelAdd);
        int sum = hadeelAdd+2;       
        System.out.println ("Addition preoformed..\n result is:" + sum);
        return sum;
    }

    public static int SubFunction(int hadeelSub) {
        System.out.println ("================== Inside Sub Function ======================");
        System.out.println ("\nyou passed the values " + hadeelSub );
        int sum = hadeelSub - 2;       
        System.out.println ("Subtraction preformed preoformed..\n result is:" + sum);
        return sum;
    }
}