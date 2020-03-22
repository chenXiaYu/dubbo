package com.example.myservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class MyserviceApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(MyserviceApplication.class, args);
        System.in.read();
    }

}
