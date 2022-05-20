package com.ngineapps.concierge.discoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class ConciergeDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConciergeDiscoveryServiceApplication.class, args);
	}

}
