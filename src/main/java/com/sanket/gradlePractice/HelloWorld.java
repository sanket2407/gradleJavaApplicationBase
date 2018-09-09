package com.sanket.gradlePractice;

public class HelloWorld {

    private static String greeting = "Hello world from Gradle project!";

    public static void main(String[] args) {
        getGreeting();
    }

    public static String getGreeting(){
        return greeting;
    }

}
