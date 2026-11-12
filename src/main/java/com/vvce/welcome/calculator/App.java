
package com.vvce.welcome.calculator;

import java.util.Scanner;

public class App {

    public static double simpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public static double compoundInterest(double p, double r, double t) {
        double amount = p * Math.pow(1 + r / 100, t);
        return amount - p;
    }

    public static double totalAmount(double p, double r, double t) {
        return p + simpleInterest(p, r, t);
    }

    public static double compoundAmount(double p, double r, double t) {
        return p + compoundInterest(p, r, t);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time Period in Years: ");
        double t = sc.nextDouble();

        if (p < 0 || r < 0 || t < 0) {
            System.out.println("Inputs cannot be negative.");
            sc.close();
            return;
        }

        System.out.println("Simple Interest: " + simpleInterest(p, r, t));

        System.out.println("Compound Interest: " + compoundInterest(p, r, t));

        System.out.println("Total Amount (Simple Interest): " + totalAmount(p, r, t));

        System.out.println("Total Amount (Compound Interest): " + compoundAmount(p, r, t));

        sc.close();
    }
}
