package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import Controllers.MainController;

@SpringBootApplication
//@ComponentScan
@ComponentScan(basePackageClasses = MainController.class)
public class FordTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FordTestApplication.class, args);
	}

}
