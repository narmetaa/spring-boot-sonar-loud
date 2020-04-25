package com.example.BatchDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.eaxample")
@EnableJpaRepositories(basePackages = "com.example")
@EntityScan(basePackages = "com.example")
public class SpringBatchSchedularDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchSchedularDemoApplication.class, args);

	}

}
