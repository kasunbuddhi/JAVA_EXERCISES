package com.my.excercise.interfaceChanges;

public class InterfaceChangesExercise implements MyChangesInterface, MyChangesInterface2 {
    @Override
    public void existingMethod(String str) {
        System.out.println("String is: "+str);
    }

    public void disp(String str){
        System.out.println("String is: "+str);
    }
    //Implementation of duplicate default method
    public void newMethod(){
        System.out.println("Implementation of default method");
    }

}
