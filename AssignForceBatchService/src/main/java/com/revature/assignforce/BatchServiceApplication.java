package com.revature.assignforce;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
/*@SpringBootApplication(scanBasePackages={
"com.revature.assignforce", "com.revature.assignforce.beans", "com.revature.assignforce.controllers",
"com.revature.assignforce.repos", "com.revature.assignforce.service"})*/
public class BatchServiceApplication {
	private static final Logger logger = LogManager.getLogger(BatchServiceApplication.class);

	public static void main(String[] args) {
		try {
			SpringApplication.run(BatchServiceApplication.class, args);
		}catch (Exception e){
			logger.error("Errors caught.", e);
		}
	}
}
