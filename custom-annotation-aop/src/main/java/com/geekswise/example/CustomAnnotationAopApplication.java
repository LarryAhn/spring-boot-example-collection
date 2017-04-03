package com.geekswise.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomAnnotationAopApplication implements CommandLineRunner {

    @Autowired
    private ExampleService exampleService;

    public static void main(String[] args) {
        SpringApplication.run(CustomAnnotationAopApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        exampleService.service();
    }
}
