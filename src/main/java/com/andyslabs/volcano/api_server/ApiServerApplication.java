package com.andyslabs.volcano.api_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiServerApplication {

	public static void main(String[] args) {
		User user = User.builder()
				.setUsername("adw")
				.setPassword("ad")
				.build();

		User user2 = User.builder().setUsername("ad").setPassword("ad").setID(1).build();

		SpringApplication.run(ApiServerApplication.class, args);
	}

}
