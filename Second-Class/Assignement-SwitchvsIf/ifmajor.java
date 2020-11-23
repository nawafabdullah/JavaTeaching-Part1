// Demonstrate use of or to chose between capital and small letters
// Later on, solve with char library character.ToLowerCase(ch); => then compare 

import java.util.Scanner;

public class ifmajor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Character");
        char Major = input.next().charAt(0);

        if (Major == 'M') {
            System.out.println("Mathematics");
        }
        if (Major == 'C') {
            System.out.println("Computer science");
        }
        if (Major == 'I') {
            System.out.println("Information technology");
        }
        if (Major != 'M' && Major != 'C' && Major != 'I') {
            System.out.println("Invalid major");
        }
    }
}


/** Alternatice Solution */

/*
public class ifmajor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Character");
        char Major = input.next().charAt(0);

        if (Major == 'M') {
            System.out.println("Mathematics");
        } else if (Major == 'C') {
            System.out.println("Computer science");
        } else if (Major == 'I') {
            System.out.println("Information technology");
        } else {
            System.out.println("Invalid major");
        }
    }
}
*/
