package com.sds.samsung.sabis.access.central;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

@PropertySource(value = "file:application.yml", ignoreResourceNotFound = true)
@SpringBootApplication 
@EnableScheduling 
@EnableAutoConfiguration 
@EnableCaching
public class CentralApplication {

	public static void main(String[] args) {
		SpringApplication.run(CentralApplication.class, args);
	}

}
