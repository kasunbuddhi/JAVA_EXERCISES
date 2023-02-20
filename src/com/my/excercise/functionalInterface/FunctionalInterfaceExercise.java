package com.my.excercise.functionalInterface;

import java.util.function.IntBinaryOperator;

public class FunctionalInterfaceExercise {

    public static void exercise1(){
        MyFunctionalInterface sum = (a, b) -> a + b;
        System.out.println("Result: "+sum.addMethod(12, 100));
    }

    public static void exercise2(){
        IntBinaryOperator sum = (a, b) -> a * b;
        System.out.println("Result: " + sum.applyAsInt(12, 100));
    }

}
