package com.phase3.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.phase3.demo.repository","com.phase3.demo.controller","com.phase3.demo.model","com.phase3.demo.impl","com.phase3.demo.service"})
@EnableJpaRepositories("com.phase3.demo.repository")
@EntityScan( basePackages = {"com.phase3.demo.model"})
public class StudentDemoApplication {

    public static void main(String[] args) {SpringApplication.run(StudentDemoApplication.class, args);
    }

}
