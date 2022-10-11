package com.functionalprogram;

import java.util.Scanner;

public class triplets {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the limit of the array : ");
        int limit=sc.nextInt();
        int [] array=new int[limit];
        System.out.println("Enter the Elements : ");
        for(int j=0;j<limit;j++){
            array[j]=sc.nextInt();
        }
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++)
            {
                for(int k=j+1;k<array.length;k++){
                    if(array[i] + array[j] + array[k]==0)
                    {
                        System.out.println("Triplets are : \n"+array[i]+"\n"+array[j]+"\n"+array[k]);
                    }
                }
            }
        }
    }

}
