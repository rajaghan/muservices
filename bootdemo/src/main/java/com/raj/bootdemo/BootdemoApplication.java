package com.raj.bootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class BootdemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BootdemoApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(BootdemoApplication.class);
	}
	
	
}
