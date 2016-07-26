package com.soneca.learn.java8.lambdas;







import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by soneca on 26/07/16.
 */
public class Main {

    private Map<Integer, String> items;

    @BeforeClass
    public void prepare(){
        System.out.println("#### this test have a how to implement concrete iterator for hashmap ####");
        items = new HashMap<>();
        items.put(0, "A");
        items.put(1, "B");
        items.put(2, "C");
        items.put(3, "D");
    }

    @Test
    public void oldWay(){
        System.out.println("Main.oldWay");
        for(Map.Entry entry : items.entrySet()){
            System.out.println("\"entry\":{\"name\":\""+ entry.getKey() +"\", \"value\": \""+ entry.getValue() +"\"}");
        }
    }

    @Test(dependsOnMethods = "oldWay")
    public void newWay(){
        System.out.println("Main.newWay");
        items.forEach((key, value) ->{
            System.out.println("\"entry\":{\"name\":\""+ key +"\", \"value\": \""+ value +"\"}");
        });
    }

}
