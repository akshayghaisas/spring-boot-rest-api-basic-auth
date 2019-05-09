package com.basicauth.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.basicauth.*")
public class RestApiBasicAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiBasicAuthApplication.class, args);
	}

}
