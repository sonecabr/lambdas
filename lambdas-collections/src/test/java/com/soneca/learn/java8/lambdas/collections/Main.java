package com.soneca.learn.java8.lambdas.collections;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by soneca on 26/07/16.
 */
public class Main {

    private List<String> items;

    @BeforeClass
    public void prepare(){
        items  = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("D");
        items.add("D");
        items.add("D");
        items.add("E");
    }

    @Test
    public void forEach(){
        System.out.println("Main.forEach");
        items.forEach(item -> {
            System.out.println(item);
        });
    }

    @Test(dependsOnMethods = "forEach")
    public void filter(){
        System.out.println("Main.filter");
        items.stream()
                .filter(item -> item.contains("C"))
                .forEach(System.out::println);
    }

    @Test(dependsOnMethods = "filter")
    public void groupBy(){
        System.out.println("Main.groupBy");
        items.stream()
                .collect(Collectors.groupingBy(item -> item, Collectors.counting()))
                .forEach((k,v)->{
                    System.out.println("\"item\":{\"key\":\""+ k +"\", \"value\":\""+ v + "\"");
                });
    }
}
