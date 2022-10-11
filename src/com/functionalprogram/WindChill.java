package com.functionalprogram;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        System.out.println("Enter value of temperature in fahrenheit  : ");
        Scanner sc = new Scanner(System.in);
        double temperature = sc.nextDouble();
        System.out.println("Enter wind speed in miles per hour : ");
        double velocity = sc.nextDouble();
        if ((temperature < 50) && ((velocity > 120) || (velocity < 3))) {
            double speed = Math.pow(velocity, 0.16);
            double product = ((0.4275 * temperature) - 35.75);
            double windChill = 35.74 + (0.6215 * temperature) + (product * speed);
            System.out.println("Wind chill : ");
            System.out.println("RESULT = " + windChill);
        } else
            System.out.println("temperature  \n " +
                    "speed ");
    }
}
