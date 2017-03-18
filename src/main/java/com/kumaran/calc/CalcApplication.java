package com.kumaran.calc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.kumaran.*")
public class CalcApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(CalcApplication.class, args);
	}

}
