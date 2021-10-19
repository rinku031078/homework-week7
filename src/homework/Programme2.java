package homework;
/*
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

import java.util.Scanner;

public class Programme2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int year;
        boolean leapyear;
        System.out.println("Please enter a year which you want to see if it is a leap year");
        year = keyboard.nextInt();
        leapyear = ((year%4==0) &&(year% 100 !=0) || (year % 400 ==0));
        if  (leapyear){
            System.out.println("This is a leap year");
        }else{
            System.out.println("This is not a leap year");
        }





    }
}
