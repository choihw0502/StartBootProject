package com.start.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootStartApplication.class, args);
		System.out.println("Start server!!");
	}

}
