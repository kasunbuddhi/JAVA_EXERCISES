package com.my.excercise.lambdaExcercise;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExercises {

    public static void arrayListExercise() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        System.out.println(" ~~ for each ~~");
        numbers.forEach(n -> System.out.print(n + " ") );
        System.out.println();

        System.out.println(" ~~ remove if / Consumer ~~");
        numbers.removeIf(n -> n ==8);
        Consumer<Integer> method = n -> {System.out.print(n + " "); };
        numbers.forEach(method );
        System.out.println();
    }

    public static void functionalInterfaceLambda() {
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
        System.out.println();
    }

    public static void twoParameterLambda() {
        Addable ad1=(a,b)->(a+b);
        System.out.println(ad1.add(10,20));

        Addable ad2=(int a,int b)->(a+b);
        System.out.println(ad2.add(100,200));

        // pass multiple statements in lambda expression
        Addable person = (a,b)-> {
            Integer int1 = a + 20;
            Integer int2 = int1 + b;
            return int2;
        };

        System.out.println(person.add(100, 20));

    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}
