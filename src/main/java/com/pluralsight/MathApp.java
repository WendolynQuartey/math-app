package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Question 1:
        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE

        int bobSalary, garySalary;
        int highestSalary;
        bobSalary = 120000;
        garySalary = 110000;
        highestSalary = Math.max(garySalary, bobSalary);
        System.out.println("The highest salary is " + highestSalary);
    }
}
