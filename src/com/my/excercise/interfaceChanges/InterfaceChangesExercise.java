package com.my.excercise.interfaceChanges;

public class InterfaceChangesExercise implements MyChangesInterface {
    @Override
    public void existingMethod(String str) {
        System.out.println("String is: "+str);
    }
}
