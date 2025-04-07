package com.andyslabs.volcano.api_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiServerApplication {

	public static void main(String[] args) {
		User user = User.builder().setUsername("adw").setPassword("ad").build();

		SpringApplication.run(ApiServerApplication.class, args);
	}

}
