package com.my.excercise.interfaceChanges;

public interface MyChangesInterface {

    /**
     * default method example
     */
    default void newMethod(){
        System.out.println("Newly added default method");
    }

    /**
     * static method
     */
    static void anotherNewMethod(){
        System.out.println("Newly added static method");
    }

    void existingMethod(String str);
}
