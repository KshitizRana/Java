package com.lectures.l5_Oops;

public class var_args {
    public static void main(String[] args) {
        //var args , when methods in java accepts arbitrary number of arguments
        System.out.println(sum(2,4));
        System.out.print(sum2(3,4,5,6));
    }
    static int sum(int a, int b){ //for this function we cannot give 3 arguments
        return a+b;
    }
    //therefore we need var args
    static int sum2(int ... args){ // is equivalent to int [] args and  ... is spread operator
        int sum = 0;
        for(int a : args){ //for each loop
            sum += a;
        }
        return sum;
    }
}
