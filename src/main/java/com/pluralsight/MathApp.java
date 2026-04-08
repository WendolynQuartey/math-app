package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Question 1:
        int bobSalary = 120000;
        int garySalary = 110000;
        int highestSalary = Math.max(garySalary, bobSalary);
        System.out.println("The highest salary is " + highestSalary);

        // Question 2:
        double carPrice = 20000.99;
        double truckPrice = 2250.83;
        System.out.println(Math.min(carPrice, truckPrice));

        // Question 3:
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Thea area of the circle with a radius of " + radius + " is " + area);

        // Question 4:
        double num = 5.0;
        System.out.println(Math.sqrt(num));

        // Question 5:

        // Question 6:
        double numVal = -3.8;
        System.out.println("The absolute value of this number is " + Math.abs(numVal));
    }
}
