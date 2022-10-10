package com.functionalprogram;

import java.util.Scanner;
public class Distance {
    void display(){
        System.out.println("Enter the value of X co-ordinate : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter the value of Y co-ordinate : ");
        int y = sc.nextInt();
        int power_x= (int) Math.pow(x,2);
        int power_y=(int) Math.pow(y,2);
        double distance =(power_x+power_y);
        System.out.println("Euclidean distance  : "+distance);
    }
    public static void main(String[] args) {
        Distance d= new Distance();
        d.display();
    }
}
