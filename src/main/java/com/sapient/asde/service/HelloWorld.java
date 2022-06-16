package com.sapient.asde.service;

public class HelloWorld {
    private String greeting;

    public HelloWorld(){

    }

    public HelloWorld(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "greeting='" + greeting + '\'' +
                '}';
    }
}
