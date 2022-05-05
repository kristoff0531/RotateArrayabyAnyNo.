package com.company;
import java.util.Scanner;
public class ArrayRotate {
    public static void main(String[] args){
        int[] array=new int[]{1,2,3,4,5};
        int[] output=new int[array.length];
        Scanner sc=new Scanner(System.in);
        int noOfRotations=sc.nextInt();
        int splittingPoint= noOfRotations;
        int i=0;
        while(splittingPoint<array.length){
            output[i]=array[splittingPoint];
            i++;
            splittingPoint++;
        }
        splittingPoint=0;
        while(splittingPoint<noOfRotations){
            output[i]=array[splittingPoint];
            i++;
            splittingPoint++;
        }
        System.out.println("Array elements are:-");
        for (int arrayElement: output
             ) {
            System.out.println(arrayElement+" ");

        }
    }
}
