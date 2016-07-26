package com.soneca.learn.java8.lambdas.funcionalinterfaces;

/**
 * Created by soneca on 26/07/16.
 */
public class Main {

    /**
     * new way to provide concrete block using sam and functional
     */
    public static void main(String []args){

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


