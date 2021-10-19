package homework;
/*
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class Programme8 {

    public static void main(String[] args) {
        System.out.println("Enter a character : ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next(). charAt(0);
        if( (ch>='A') && ch<='F'){
            System.out.println("Valid city char");

        }else{
            System.out.println("Invalid Entry");
        }
    }
}
