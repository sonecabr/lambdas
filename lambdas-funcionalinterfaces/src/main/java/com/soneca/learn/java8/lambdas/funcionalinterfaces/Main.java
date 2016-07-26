package com.soneca.learn.java8.lambdas.funcionalinterfaces;

/**
 * Created by soneca on 26/07/16.
 */
public class Main {

    /**
     * new way to provide concrete block using sam and functional
     */
    public static void main(String []args){
        //sam
        run(new ExampleInterface(){

            @Override
            public void doWork() {
                System.out.println("ExampleInterface is running with single abstract method interfaces (SAM Interface)");
            }
        });

        //functional interface
        run(()-> System.out.println("ExampleInterface is running with functional interfaces"));
    }

    public static void run(ExampleInterface eI){
        eI.doWork();
    }
}

@FunctionalInterface
interface ExampleInterface {
    public void doWork();
}


