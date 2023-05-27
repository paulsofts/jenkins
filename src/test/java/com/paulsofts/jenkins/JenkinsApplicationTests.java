package com.paulsofts.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsApplicationTests {
	
	public static Logger LOGGER = LogManager.getLogger(JenkinsApplicationTests.class);

	@Test
	void contextLoads() {
		LOGGER.info("Jenkins executing Test Cases");
		//adding one more log statement for testing Jenkins CI process
		LOGGER.info("Executing Jenkins Test Cases - for testing continuous integration");
		assertEquals(true, true);
	}
	
	@Test
	void successJenkinsBuild() {
		//executing test case to fail for testing Jenkins CI process
		LOGGER.info("Success Jenkins Build...");
		assertEquals(true, false);
	}

}
