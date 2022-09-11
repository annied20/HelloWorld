package com.example.helloworld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld {
    public static void main(String[] args) throws IOException {
        System.out.println("Program starting... Please put in your name for initiation: ");
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        String name = reader.readLine();

        // Printing the read line
        System.out.println("My First Java program. Hello World, this is " + name);
    }
}
