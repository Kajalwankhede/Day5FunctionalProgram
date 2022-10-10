package com.functionalprogram;

import java.util.Scanner;

public class triplets {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=sc.nextInt();
        int [] inputArray=new int[size];
        System.out.println("Enter the elements : ");
        for(int j=0;j<size;j++){
            inputArray[j]=sc.nextInt();
        }
        for(int i=0;i<inputArray.length;i++){
            for(int j=i+1;j<inputArray.length;j++){
                for(int k=j+1;k<inputArray.length;k++){
                    if(inputArray[i] + inputArray[j] + inputArray[k]==0){
                        System.out.println("Triplets are : \n"+inputArray[i]+"\n"+inputArray[j]+"\n"+inputArray[k]);
                    }
                }
            }
        }
    }

}
