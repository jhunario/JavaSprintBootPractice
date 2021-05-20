package com.abiDemo.abiDemoApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.abiDemo.abiDemoApplication")
@SpringBootApplication
public class AbiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbiDemoApplication.class, args);
	}

}
