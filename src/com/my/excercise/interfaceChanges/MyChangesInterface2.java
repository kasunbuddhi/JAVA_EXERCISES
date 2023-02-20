package com.my.excercise.interfaceChanges;

public interface MyChangesInterface2 {

    default void newMethod(){
        System.out.println("Newly added default method");
    }
    void disp(String str);
}
