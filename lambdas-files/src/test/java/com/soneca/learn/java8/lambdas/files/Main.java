package com.soneca.learn.java8.lambdas.files;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by soneca on 26/07/16.
 */
public class Main {

    @BeforeClass
    public void prepare(){
        System.out.println("### How to read and write files ###");
    }
    @Test
    public void read(){
        System.out.println("Main.read");
        try(Stream<String> stream = Files.lines(Paths.get(this.getClass().getClassLoader().getResource("testfile.txt").getFile()))){
            stream.forEach(System.out::println);
        } catch (Exception e){
            e.printStackTrace();
        } finally {

        }
    }

    @Test(dependsOnMethods = "read")
    public void buffered(){
        System.out.println("Main.buffered");
        try(BufferedReader br = Files.newBufferedReader(Paths.get(this.getClass().getClassLoader().getResource("testfile.txt").getFile()))){
            br.lines().collect(Collectors.toList()).forEach(System.out::println);
        } catch (Exception e){

        } finally {

        }
    }

}
