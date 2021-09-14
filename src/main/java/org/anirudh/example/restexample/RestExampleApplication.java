package org.anirudh.example.restexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class RestExampleApplication {

	public static void main(String[] args) {
		System.out.println("Webhook working");
		SpringApplication.run(RestExampleApplication.class, args);
	}

}
