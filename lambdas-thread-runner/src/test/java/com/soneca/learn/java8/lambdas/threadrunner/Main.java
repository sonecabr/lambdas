package com.soneca.learn.java8.lambdas.threadrunner;


import org.testng.annotations.Test;

/**
 * Created by soneca on 26/07/16.
 */
public class Main {

    @Test
    public void test() {
        System.out.println("### This example have how to use lambdas to implement a concrete Runnable ####");
        new Thread(() -> System.out.println("Thread is running...")).start();
    }
}
