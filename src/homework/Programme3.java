package homework;
/*
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */

import java.util.Scanner;

public class Programme3 {

    public static void main(String[] args) {
        int Math, Science, English, Total;
        float percentage;
        String Grade="0";
        String Name;
        String Result,Status="0";
        Scanner in = new Scanner(System.in);

        System.out.print("Name :");
        Name = in.nextLine();
        System.out.print("Rollno :");
        int RollNo = in.nextInt();
        System.out.print("Math :");
        Math = in.nextInt();
        System.out.print("Science :");
        Science = in.nextInt();
        System.out.print("English :");
        English = in.nextInt();

        Total = Math + Science + English;
        percentage = Total * 100 / 300;
        System.out.println("Total =" + Total);
        System.out.println("percentage = " + percentage);

        if (percentage >= 80) {
            Grade = "A+";
            System.out.println("Grad  : A+");
        } else if (percentage >= 60) {
            Grade = "A";
            System.out.println("Grad  : A");
        } else if (percentage >= 50) {
            Grade = "B";
            System.out.println("Grad  : B");
        } else if (percentage >= 35) {
            Grade="c";
            System.out.println("Grade  : c");

        }


        if ((Math > 100) || (Science > 100) || (English > 100)) {
            Status="Invalid";
            System.out.println("Invalid input,Marks should be between 0 to 100");

        }
        if ((Math < 35) || (Science < 35) || (English < 35)) {
            Result="fail";
            System.out.println("Result : Fail");
        } else {
            Result = "pass";
            System.out.println("Result : Pass");
        }

        System.out.println("------------------------------- ");
        System.out.println("|                              |");
        System.out.println("|      Mark Sheet              |");
        System.out.println("|------------------------------|");
        System.out.println("|                              |");
        System.out.println("|Name        :   " + Name + "  |");
        System.out.println("|Roll No :   " + RollNo + "    |");
        System.out.println("|Subjects   :      Marks       |");
        System.out.println("|-------------------------------");
        System.out.println("|MATH       :     " + Math + " |       ");
        System.out.println("|Science    :   " + Science + " |      ");
        System.out.println("|English    :   " + English + "|       ");
        System.out.println("|Total      :  " + Total + "   |       ");
        System.out.println("|Percentage :" + percentage + "|       ");
        System.out.println("|Result     :  " +Result+  "   |       ");
        System.out.println("|Grade     :  " +Grade+       " |      ");
    }




}
