package homework;
/*
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */

import java.util.Scanner;

public class Programme7 {
    public static void main(String[] args) {
        double TotalSales;
        double CommissionRate = 0.0;
        double Commission;
        Scanner Read = new Scanner(System.in);
        System.out.println("Enter the sales amount");
        TotalSales = Read.nextDouble();
        if (TotalSales >= 50000) {
            CommissionRate = 0.35;
        } else if (TotalSales >= 30000)
            CommissionRate = 0.20;
        else if (TotalSales >= 20000)
            CommissionRate = 0.10;
        else if (TotalSales >= 10000)
            CommissionRate = 0.05;
        else if (TotalSales < 10000)
            CommissionRate = 0.02;
        Commission = CommissionRate + TotalSales;
        System.out.println(" The Commission is :" + Commission);
    }
}
