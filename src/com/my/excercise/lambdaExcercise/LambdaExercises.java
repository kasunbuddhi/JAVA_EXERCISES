package com.my.excercise.lambdaExcercise;

import com.my.excercise.models.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

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

    public static void comparatorLambda() {
        List<Product> list=new ArrayList<Product>();

        //Adding Products
        list.add(new Product(1,"HP Laptop",25000f));
        list.add(new Product(2,"Keyboard",300f));
        list.add(new Product(3,"Dell Mouse",150f));
        list.add(new Product(4,"Samsung A5",17000f));
        list.add(new Product(5,"Iphone 6S",65000f));
        list.add(new Product(6,"Sony Xperia",25000f));
        list.add(new Product(7,"Nokia Lumia",15000f));
        list.add(new Product(8,"Redmi4 ",26000f));
        list.add(new Product(9,"Lenevo Vibe",19000f));

        System.out.println("Sorting on the basis of name...");

        // implementing lambda expression
        Collections.sort(list,(p1, p2)->{
            return p1.getName().compareTo(p2.getName());
        });
        for(Product p:list){
            System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice());
        }
        System.out.println(" ~ using lambda to filter data ~");
        // using lambda to filter data
        Stream<Product> filtered_data = list.stream().filter(p -> p.getPrice() > 20000);

        filtered_data.forEach(
                product -> System.out.println(product.getName()+": "+product.getPrice())
        );
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}
