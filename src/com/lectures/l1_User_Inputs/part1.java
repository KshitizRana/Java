package com.lectures.l1_User_Inputs;

import java.util.Scanner;

public class part1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = in.next();
        System.out.println("hello! "+name);
    }
}
