package com.fmgarcia.draco.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = { "com.fmgarcia" })
@EntityScan(basePackages = { "com.fmgarcia" })
@ComponentScan(basePackages = { "com.fmgarcia" })
public class DracoWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DracoWebApplication.class, args);
	}

}
