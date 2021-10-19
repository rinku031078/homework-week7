package homework;
/*
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */

import java.util.Scanner;

public class Programme11 {

    public void Divide() {
        System.out.println("Divided by 3:");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + ",");

        }
        System.out.println("\n");
        System.out.println("Divided by 5:");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0)
                System.out.print(i + ",");

        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Programme11 obj = new Programme11();
        obj.Divide();

    }


}
