package com.my.excercise.methodReferences;

public class MethodReferencesExercise {

    public void myMethod(){
        System.out.println("Instance Method");
    }

    public static void exercise1(){
        MethodReferencesExercise obj = new MethodReferencesExercise();
        MyInterface ref = obj::myMethod;
        ref.display();
    }
}
