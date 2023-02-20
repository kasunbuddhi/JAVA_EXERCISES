package com.my.excercise.methodReferences;

public class MethodReferences {
    public static void main (String[] arg) {
        MyInterface exercise1 = MethodReferencesExercise::exercise1;
        MyInterface exercise2 = MethodReferencesExercise::exercise2;
        MyInterface exercise3 = MethodReferencesExercise::exercise3;
        MyInterface exercise4 = MethodReferencesExercise::exercise4;

        exercise1.display();
        exercise2.display();
        exercise3.display();
        exercise4.display();
    }
}
