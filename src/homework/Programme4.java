package homework;

import java.util.Scanner;

public class Programme4 {

    static int year;
    static int month;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter any year");
        year = input.nextInt();
        System.out.println("enter  month");
        month = input.nextInt();
        getDaysInMonth(month, year);
        isLeapYear(year);
        input.close();
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }

    }

    public static void getDaysInMonth(int month, int year) {

        if ((month < 1) || (month > 12) || (year < 1) || (year > 9999)) {
            System.out.println("-1");

        }

        switch (month) {
            case 1:
                System.out.println("31");
                break;
            case 2:
                if (Programme4.isLeapYear(year)) {
                    System.out.println("29");
                } else
                    System.out.println("28");
                break;
            case 3:
                System.out.println("31");
                break;
            case 4:
                System.out.println("30");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("31");
                break;
            case 9:
                System.out.println("30");
                break;
            case 10:
                System.out.println("31");
                break;
            case 11:
                System.out.println("30");
                break;
            case 12:
                System.out.println("31");
                break;
        }


    }


}
