package com.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Spring.configProperties.DevProperties;

@SpringBootApplication
public class SpringTrainningApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringTrainningApplication.class, args);
		
	}
	
	@Autowired
	DevProperties devProperties;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(devProperties.getName());
		System.out.println(devProperties.getAge());
		
	}

}
