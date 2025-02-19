package com.lectures.l3;

import java.util.Scanner;

public class part2 {
    public static void main(String[] args) {
        int [] arr=array_utility();
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static int[] array_utility(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }
}
