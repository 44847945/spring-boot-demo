package com.domain.sdemo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SdemoApplication {
	
	public static ApplicationContext applicationContext;
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SdemoApplication.class);
		Set<Object> set = new HashSet<Object>();
		set.add("classpath:applicationContext.xml");
		app.setSources(set);
		applicationContext = app.run(args);
	}

}
