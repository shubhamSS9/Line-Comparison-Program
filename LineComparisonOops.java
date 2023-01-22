package com.bridglabz;

import java.util.Scanner;
public class LineComparisonOops {
    static Scanner scan = new Scanner(System.in);
    double x1, y1, x2, y2;
    double lineLength;

    static void compareLength(Double line1, Double line2) {

        if (line1.compareTo(line2) == 0) {
            System.out.println("Both are equal..");
        } else if (line1.compareTo(line2) == -1) {
            System.out.println("Line 1 is smaller than Line 2");
        } else if (line1.compareTo(line2) == 1) {
            System.out.println("Line 2 is smaller than Line 1");
        }
    }

    double getLineLength() {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

    }

    void getUserValues() {

        System.out.println("Enter the value of x1 : ");
        x1 = scan.nextDouble();
        System.out.println("Enter the value of y1 : ");
        y1 = scan.nextDouble();

        System.out.println("Enter the value of x2 : ");
        x2 = scan.nextDouble();
        System.out.println("Enter the value of y2 : ");
        y2 = scan.nextDouble();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        LineComparisonOops lc = new LineComparisonOops();
        LineComparisonOops lc2 = new LineComparisonOops();
        lc.getUserValues();
        lc.lineLength = lc.getLineLength();
        lc2.getUserValues();
        lc2.lineLength = lc2.getLineLength();
        compareLength(lc.lineLength, lc2.lineLength);

    }

}
