package com.example;

import config.JpaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SsApplication {

	public static void main(String[] args) {
		SpringApplication.run(new Class<?>[] {SsApplication.class, JpaConfig.class}, args);
	}
}
