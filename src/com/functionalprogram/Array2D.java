package com.functionalprogram;
import java.util.Scanner;
public class Array2D {
    public static void main(String[] args) {
        System.out.println("Enter The Number of Rows: ");
        Scanner sc=new Scanner(System.in);
        int i,j;
        int RowM= sc.nextInt();
        System.out.println("Enter The Number of Columns : ");
        int ColumnN=sc.nextInt();
        int[][] array=new int[RowM][ColumnN];
        System.out.println("Enter the Elements: ");
        for (i=0;i<RowM;i++)
        {
            for (j=0;j<ColumnN;j++){
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("The 2-Dimensional Array is: ");
        for(i=0;i<array.length;i++){
            for(j=0; j<array.length; j++){
                System.out.println(array[i][j]+ "");
            }
        }
    }
}
