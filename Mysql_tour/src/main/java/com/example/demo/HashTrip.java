package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})  //mongodb만 사용시 datasource 설정 부분
//@EnableMongoRepositories(basePackages = "com.example.repository")
@EnableJpaRepositories(basePackages = "com.example.repository")
@ComponentScan({"com.example.controller", "com.example.security", "com.example.aop"})
@EntityScan(basePackages = {"com.example.entity"})
@Configuration
public class HashTrip extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(HashTrip.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HashTrip.class);
	}


}
