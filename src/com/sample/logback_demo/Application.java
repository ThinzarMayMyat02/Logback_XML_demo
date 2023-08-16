package com.sample.logback_demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.core.joran.spi.JoranException;

public class Application {
	private static final Logger logger=LoggerFactory.getLogger(Application.class);
	
	public Application() {
	}
	
	public void SayMicro()throws JoranException {
		try {
			for(int i=1; i<100; i++) {
				logger.info("Hello :loop at {}......",i);
				logger.debug("Debugger info..!!");
			}
		} catch (Exception e) {
			logger.error("Error at {}",e.getMessage());
			throw new JoranException("This is Joran Exception");
		}
	}
}
