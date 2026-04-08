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
        double distance = Math.sqrt(Math.pow((85-5), 2) + Math.pow((50-10), 2));
        System.out.println("The distance between (5,10) and (85,50) is " + distance);
        // Question 6:
        double numVal = -3.8;
        System.out.println("The absolute value of this number is " + Math.abs(numVal));

        // Question 7:
        System.out.println("A random number between 0 and 1 is "+ Math.random());

        // Question 8:
        int days = 24;
        int minutes = 24*60;
        int milliseconds = minutes * 60000;
        System.out.print("There are " + minutes + " minutes in " + days + " days.");
        System.out.print(" There are also " + milliseconds + " milliseconds in " + days + " days.");
    }
}
