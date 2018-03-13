package com.onlymark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class BirdApplication {

	public static void main(String[] args) {
		SpringApplication.run(BirdApplication.class, args);
	}
}
