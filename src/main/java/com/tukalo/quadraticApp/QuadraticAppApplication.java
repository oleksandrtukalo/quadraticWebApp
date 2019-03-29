package com.tukalo.quadraticApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class QuadraticAppApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder createSpringApplicationBuilder() {
        return super.createSpringApplicationBuilder();
    }

    public static void main(String[] args) {
        SpringApplication.run(QuadraticAppApplication.class, args);
    }
}
