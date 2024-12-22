package com.example.AttestateRestApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.AttestateRestApi.entity")
public class AttestateRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AttestateRestApiApplication.class, args);
	}

}
