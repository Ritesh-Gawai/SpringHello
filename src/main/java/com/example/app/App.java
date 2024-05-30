package com.example.app;

import com.example.config.AppConfig;
import com.example.service.HelloService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        // Load Spring configuration
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get bean from Spring container
        HelloService helloService = context.getBean(HelloService.class);

        // Use the bean
        System.out.println(helloService.getGreeting());

        // Close the context
        context.close();
    }
}
