package com.medfusion.medfusion_user_service;

import com.netflix.discovery.EurekaClient;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MedfusionUserServiceApplication {

	@Autowired
	private EurekaClient eurekaClient;

	public static void main(String[] args) {
		SpringApplication.run(MedfusionUserServiceApplication.class, args);
	}

	@PreDestroy
	public void deregisterFromEureka() {
		System.out.println("Deregistering from Eureka...");
		eurekaClient.shutdown();
	}
}
