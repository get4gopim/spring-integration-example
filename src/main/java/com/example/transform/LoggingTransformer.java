package com.example.transform;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.messaging.handler.annotation.Header;

public class LoggingTransformer {
	
	private static final Logger LOGGER = LogManager.getLogger();
	
	public String loggingTo(@Header("timestamp") long timeInMillis) {
		LOGGER.info("query.timeInMillis = %d", timeInMillis);
		return "" + timeInMillis;
	}

}
