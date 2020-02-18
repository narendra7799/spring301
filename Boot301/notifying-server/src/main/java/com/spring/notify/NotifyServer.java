package com.spring.notify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient
public class NotifyServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(NotifyServer.class, args);
	}

}
