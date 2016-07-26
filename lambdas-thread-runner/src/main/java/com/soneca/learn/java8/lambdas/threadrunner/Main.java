package com.soneca.learn.java8.lambdas.threadrunner;

/**
 * Created by soneca on 26/07/16.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("### This example have how to use lambdas to implemente a concrete Runnable ####");
        new Thread(() -> System.out.println("Thread is running...")).start();
    }
}
