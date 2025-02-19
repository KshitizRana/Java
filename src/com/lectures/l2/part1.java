package com.lectures.l2;

import java.util.Scanner;

public record part1() {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int input=sc.nextInt();
        if(input%4==0 && (input%100!=0 || input%400==0)){
            System.out.println(input+" is a leap year");
        }
        else {
            System.out.println(input+" is not a leap year");
        }
    }
}
