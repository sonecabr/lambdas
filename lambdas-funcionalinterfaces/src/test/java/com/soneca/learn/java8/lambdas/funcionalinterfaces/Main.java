package com.soneca.learn.java8.lambdas.funcionalinterfaces;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * Created by soneca on 26/07/16.
 */
public class Main {

    /**
     * new way to provide concrete block using sam and functional
     */
    @Test
    public void testA(){

        System.out.println("##### this example show how to use functional interfaces instead Singleton Abstract Method Interfaces ####");
        //sam
        run(new ExampleInterface(){

            @Override
            public void doWork() {
                System.out.println("ExampleInterface doing work with singleton abstract method interfaces (SAM Interface)");
            }
        });

        //functional interface
        run(() -> System.out.println("ExampleInterface doing work with functional interfaces and lambda"));
    }

    @Test
    public void testB(){

        new ExampleExtendingFunctionalInterface() {

            @Override
            public void doWork() {
                System.out.println("test extended Running in sam");
            }
        }.doSomething();

        ((ExampleExtendingFunctionalInterface) ()-> System.out.printf("Test extended Running in functional lambda")).doSomeOther();
    }

    public static void run(ExampleInterface eI){
        eI.doWork();
    }
}

@FunctionalInterface
interface ExampleInterface {
    public void doWork();
}

@FunctionalInterface
interface ExampleExtendingFunctionalInterface extends ExampleInterface {
    default void doSomething(){
        System.out.printf("ComplexExample doing something...");
    }
    default void doSomeOther(){
        System.out.printf("ComplexExample doing some other work...");
    }
}


