package com.functionalprogram;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        System.out.println("Enter The Number of Rows: ");
        Scanner sc=new Scanner(System.in);
        int i,j;
        int Rowsize = sc.nextInt();
        System.out.println("Enter The Number of Columns : ");
        int Columnsize=sc.nextInt();
        int[][] array=new int[Rowsize][Columnsize];
        System.out.println("Enter the Elements: ");
        for (i=0;i<Rowsize;i++)
        {
            for (j=0;j<Columnsize;j++){
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("The 2D Array is: ");
        int row=0,column=0;
        for(i=0;i<array.length;i++){
            for(j=0; j<array.length; j++){
                System.out.println(array[i][j]+ "");
            }
            System.out.println();
        }
    }
}
