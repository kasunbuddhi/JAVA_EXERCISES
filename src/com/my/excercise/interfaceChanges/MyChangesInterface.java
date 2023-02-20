package com.my.excercise.interfaceChanges;

public interface MyChangesInterface {

    /**
     * default method example
     */
    default void newMethod(){
        System.out.println("Newly added default method");
    }

    void existingMethod(String str);
}
