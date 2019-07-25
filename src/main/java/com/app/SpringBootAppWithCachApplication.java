package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootAppWithCachApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppWithCachApplication.class, args);
	}

}
