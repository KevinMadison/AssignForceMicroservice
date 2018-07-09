package com.revature.assignforce;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigServerApplication {
	private static final Logger logger = LogManager.getLogger(ConfigServerApplication.class);

	public static void main(String[] args) {
		try {
			SpringApplication.run(ConfigServerApplication.class, args);
		}catch (Exception e){
			logger.error("Errors caught.", e);
		}
	}
}
