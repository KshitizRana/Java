package com.lectures.l4_arrays;

import java.util.Scanner;

public class part4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr=part2.array_utility();
        System.out.println("Enter the element to search");
        int n=sc.nextInt();
        int occ=occurances(arr,n);
        System.out.println(occ);
    }
    public static int occurances(int [] arr,int search_element){
        int occurances=0;
        for(int i=0;i<arr.length;i++){
            if (search_element==arr[i]){
                occurances++;
            }
        }
        return occurances;
    }
}
