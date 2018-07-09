package com.revature.assignforce;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableZuulProxy
@RestController
@CrossOrigin(origins="http://localhost:4200")
public class GatewayServerApplication {
	private static final Logger logger = LogManager.getLogger(GatewayServerApplication.class);


	public static void main(String[] args) throws Exception {
		try {
			SpringApplication.run(GatewayServerApplication.class, args);
		}catch (Exception e){
			logger.error("Errors caught.", e);
		}
	}


}