package com.app.banking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankingApplication {

	private static final Logger log= LoggerFactory.getLogger(BankingApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(BankingApplication.class, args);

		log.info("Application Started");

	}

}
