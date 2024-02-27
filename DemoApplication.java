package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext; // Import ApplicationContext

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext x = SpringApplication.run(DemoApplication.class, args);

		NewOne n = x.getBean(NewOne.class);
		n.code();
	}

}