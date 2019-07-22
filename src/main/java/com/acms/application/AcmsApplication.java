package com.acms.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.acms.application.repository")
public class AcmsApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(AcmsApplication.class, args);
	}
	
	public void run() {
	}
}
