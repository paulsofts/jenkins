package com.paulsofts.jenkins;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsApplication {
	
	public static Logger LOGGER = LogManager.getLogger(JenkinsApplication.class);
	
	//this method will run before the JenkinsApplication starts
	//@PostConstruct is executed once the spring bean is initialized
	@PostConstruct
	public void init() {
		LOGGER.info("JenkinsApplication is Starting....");
		LOGGER.info("Jenkins - Introduction to Continuous Integration");
	}

	public static void main(String[] args) {
		LOGGER.info("JenkinsApplicaion is Running!!!!");
		SpringApplication.run(JenkinsApplication.class, args);
	}

}
