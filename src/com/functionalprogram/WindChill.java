package com.functionalprogram;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        System.out.println("Enter value of temperature  : ");
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        System.out.println("Enter wind speed in miles per hour : ");
        double WindSpeed = sc.nextDouble();
        if ((temp < 50) && ((WindSpeed > 120) || (WindSpeed < 3))) {
            double speed = Math.pow(WindSpeed, 0.16);
            double product = ((0.4275 * temp) - 35.75);
            double windChill = 35.74 + (0.6215 * temp) + (product * speed);
            System.out.println("Wind chill : ");
            System.out.println("RESULT = " + windChill);
        } else
            System.out.println("temperature  \n " +
                    "speed ");
    }
}
