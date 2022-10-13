package com.functionalprogram;
import java.util.Scanner;
import static java.lang.Math.sqrt;
public class Quadratic {
 void display(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Value of a: ");
        double a = scan.nextDouble();
        System.out.println("Enter the Value of b: ");
        double b = scan.nextDouble();
        System.out.println("Enter the Value of c: ");
        double c = scan.nextDouble();
        double delta = ((b * b) - (4 * a * c));
        System.out.println("Value of (b*b) - (4*a*c)  :" + delta);
        double Root1 = (-b + sqrt(delta)) / (2 * a);
        double Root2 = (-b - sqrt(delta)) / (2 * a);
        System.out.println("Root1 : " + Root1 + " Root2 : " + Root2);
    }
    public static void main(String[] args) {
        Quadratic q=new Quadratic();
        q.display();
    }
}
