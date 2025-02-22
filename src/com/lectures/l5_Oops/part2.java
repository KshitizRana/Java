package com.lectures.l5_Oops;

import java.lang.Math.*;

public class part2 {
    class Program{
        static int a;
        static void func(){
            a=10;
        }
        static class Test{
            static String country="India";
        }

    }
    public static void main(String[] args) {
       //1.every time a class is instantiated a new copy of each of them is created which are instance variables and instance methods
//       2.static member are members which are associated to class itself rather than individual objects. they are referred as class variables and class methods
//       3.static members that are members to all the objects are accessed without a particular object
//       4.java creates only one copy of static variable which can be used even if the class is actually instantiated
        System.out.println(Program.Test.country); //accessing the static variable in test without creating an object
    }
}
