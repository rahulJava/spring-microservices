package com.in28Minutes.microservices.springcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigServerApplication {

	public static void main(String[] args) {
		System.out.println("Inside main");
		System.out.println("Inside line no 12");
		SpringApplication.run(SpringCloudConfigServerApplication.class, args);
	}

}
