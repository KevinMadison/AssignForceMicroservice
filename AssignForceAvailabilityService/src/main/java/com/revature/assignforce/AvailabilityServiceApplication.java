package com.revature.assignforce;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AvailabilityServiceApplication {
	private static final Logger logger = LogManager.getLogger(AvailabilityServiceApplication.class);
		
	public static void main(String[] args) throws Exception {
		try {
			SpringApplication.run(AvailabilityServiceApplication.class, args);
		} catch (Exception e) {
			logger.error("Errors caught.", e);
		}
	}
}
