/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *
 */ 
import java.util.Scanner;
public class major {
    public static void main(String[] args){  
        
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a Character");
    char Major = keyboard.next().charAt(0);
   
    System.out.print("Enter a Character:  ");
       
      switch(Major)
        {
            case 'M':
                System.out.println('M');
                System.out.println("Mathematics");
                break;
            case 'C':
                System.out.println('C');
                System.out.println("Computer science");
                break;
            case 'I':
                System.out.println('I');
                System.out.println("Information technology");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
        
    }
}
