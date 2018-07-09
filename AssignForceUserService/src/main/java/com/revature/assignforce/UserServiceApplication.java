package com.revature.assignforce;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class UserServiceApplication {
    private static final Logger logger = LogManager.getLogger(UserServiceApplication.class);

    public static void main(String[] args) throws Exception{
        try {
            SpringApplication.run(UserServiceApplication.class, args);
        }catch (Exception e){
            logger.error("Errors caught.", e);
        }
    }
}
