package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringBootJdbcApplication implements CommandLineRunner {
	@Autowired
	JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		
	
	  SpringApplication.run(SpringBootJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		int n=jdbcTemplate.update("insert into emp values(9,'ra',4000,abhi@gmail.com')");
		System.out.println("row inserted"+n);
	
		
	}

}
