package com.functionalprogram;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        System.out.println("Enter value of temperature in fahrenheit (less than 50) : ");
        Scanner sc = new Scanner(System.in);
        double temperature = sc.nextDouble();
        System.out.println("Enter wind speed in miles per hour (speed>120 or speed <3) : ");
        double velocity = sc.nextDouble();
        if ((temperature < 50) && ((velocity > 120) || (velocity < 3))) {
            double speed = Math.pow(velocity, 0.16);
            double product = ((0.4275 * temperature) - 35.75);
            double windChill = 35.74 + (0.6215 * temperature) + (product * speed);
            System.out.println("Wind chill ,W=35.74+0.6215t+(0.4275t-35.75)v^0.16  ");
            System.out.println("result = " + windChill);
        } else
            System.out.println("temperature  should be larger than 50 \n " +
                    "speed should be larger than 120 and less than 3");
    }
}
