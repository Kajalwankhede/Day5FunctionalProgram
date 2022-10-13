package com.functionalprogram;
import java.util.Scanner;
public class WindChill {
    public static void main(String[] args) {
        System.out.println("Enter value of temperature  : ");
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        System.out.println("Enter wind speed in miles per hour : ");
        double WindSpeed = sc.nextDouble();
        if ((temp < 50) && ((WindSpeed > 120) || (WindSpeed < 3)))
        {
            double speed = Math.pow(WindSpeed, 0.16);
            double sum = ((0.4275 * temp) - 35.75);
            double Windchill = 35.74 + (0.6215 * temp) + (sum * speed);
            System.out.println("Wind chill : = " + Windchill);
        }
        else
            System.out.println("Invalid Input.Temprature is larger than 50 in absolute value and WindSpeed is larger\n" +
                    "than 120 or less than 3" );
    }
}
