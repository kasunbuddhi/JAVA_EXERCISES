package com.my.excercise.methodReferences;

import java.util.Arrays;
import java.util.function.BiFunction;

public class MethodReferencesExercise {

    public MethodReferencesExercise(){
        System.out.println("without param constructor");
    }

    public MethodReferencesExercise(String say){
        System.out.print(say);
    }

    public void myMethod(){
        System.out.println("Instance Method");
    }

    /**
     * Method reference to an instance method of an object
     */
    public static void exercise1(){
        MethodReferencesExercise obj = new MethodReferencesExercise();
        MyInterface ref = obj::myMethod;
        ref.display();
    }

    /**
     * Method reference to a static method of a class
     */
    public static void exercise2(){
        BiFunction<Integer, Integer, Integer> product = Multiplication::multiply;
        int pr = product.apply(11, 5);
        System.out.println("Product of given number is: "+pr);
    }

    public static void exercise3(){
        String[] stringArray = { "Steve", "Rick", "Aditya", "Negan", "Lucy", "Sansa", "Jon"};
        /* Method reference to an instance method of an arbitrary
         * object of a particular type
         */
        Arrays.sort(stringArray, String::compareToIgnoreCase);
        for(String str: stringArray){
            System.out.println(str);
        }
    }

    /**
     * Method reference to a constructor
     */
    public static void exercise4(){
        MyInterfaceParam ref = MethodReferencesExercise::new;
        ref.display("Hello World!");

        System.out.println("\nwithout param");

        /** without param */
        MyInterface ref2 = MethodReferencesExercise::new;
        ref2.display();
    }
}
