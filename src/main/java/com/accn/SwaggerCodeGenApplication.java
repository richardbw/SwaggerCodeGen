package com.accn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SwaggerCodeGenApplication {

	private static final Logger log = LoggerFactory.getLogger(SwaggerCodeGenApplication.class);

	public static void main(String[] args) {
		log.info("Startin' up...........................................");
		SpringApplication.run(SwaggerCodeGenApplication.class, args);
	}
}
