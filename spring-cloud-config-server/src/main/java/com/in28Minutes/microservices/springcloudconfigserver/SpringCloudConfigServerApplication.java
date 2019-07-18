package com.in28Minutes.microservices.springcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudConfigServerApplication {

	public static void main(String[] args) {
		System.out.println("Inside main");
		SpringApplication.run(SpringCloudConfigServerApplication.class, args);
	}

}
