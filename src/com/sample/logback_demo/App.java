package com.sample.logback_demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	private static final Logger logger=LoggerFactory.getLogger(App.class);
	public static void main(String[] args) throws Exception {
		Application app=new Application();
		app.SayMicro();
		
		logger.debug("I am debug in main class..."); 
		logger.error("I am error in {}", "in App main...");
	}

}
