package com.lectures.l6_inheritance;

public class part1 {


    // relation between classes-:
    //1. Inheritance (IS-A)
    //2. Association (HAS-A) --: a. Aggregation (weak bond, one way, 2 class exist independently), b. Composition (Strong bond, two-way)

    //        Eg.  Car
    //            /   \
    //           /     \
    //        Music     Engine
    //        Player

    //  Car will exist without Music Player as car will hold its independent identity. This is aggregation
    //  However, car cannot exist without the engine and engine cannot exist without the car. This is Composition

    class Car{

    }
    class Engine extends Car{

    }

    public static void main(String[]args){

    }
}

