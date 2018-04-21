package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:config.xml")
public class Application {
	
	private static final Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {
    	LOGGER.info("Application Started ...");
    	
        SpringApplication.run(Application.class, args);
    }
}
