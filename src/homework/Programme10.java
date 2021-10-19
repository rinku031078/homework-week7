package homework;
/*
 * Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

import java.util.Scanner;

public class Programme10 {

    public static void main(String[] args) {
        char ch;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number");
        int num2 = scan.nextInt();
        System.out.println("Enter the operator you want(+,-,*,/):");
        ch = scan.next().charAt(0);

        if (ch == '+') {
            System.out.println("\nAddition of " + num1 + "+" + num2 + " = " + (num1 + num2));
        } else if (ch == '-') {
            System.out.println("Substraction of " + num1 + "-" + num2 + " = " + (num1 - num2));
        } else if (ch == '*') {
            System.out.println("Multiplication of " + num1 + "x" + num2 + " = " + (num1 * num2));
        } else if (ch == '/') {
            System.out.print("Division of " + num1 + "/" + num2 + " = " + (num1 / num2));
        } else {
            System.out.print("Operator is not available");
        }

    }
}
