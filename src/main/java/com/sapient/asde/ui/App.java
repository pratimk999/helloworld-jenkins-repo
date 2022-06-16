package com.sapient.asde.ui;

import com.sapient.asde.service.HelloWorld;

public class App {
    public static void main(String[] args) {
        System.out.println(new HelloWorld("Hello world!").getGreeting());
    }
}
