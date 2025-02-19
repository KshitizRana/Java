package com.lectures.l4;

import java.util.Scanner;

public class part1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={1,2,3,4,5,6};
        System.out.println("Enter the number to search");
        int n=sc.nextInt();
        boolean isfound=isFound(arr,n);
        if (isfound){
            System.out.println("Found");
        } else{
            System.out.println("Not Found");
        }
    }
    static boolean isFound(int [] arr,int n){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==n){
                return true;
            }
        }
        return false;
    }
}