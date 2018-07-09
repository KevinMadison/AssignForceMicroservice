package com.revature.assignforce;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoveryServiceApplication {
	private static final Logger logger = LogManager.getLogger(DiscoveryServiceApplication.class);


	public static void main(String[] args) throws Exception {
		try {
			SpringApplication.run(DiscoveryServiceApplication.class, args);
		}catch (Exception e){
			logger.error("Errors caught.", e);
		}
	}

}
