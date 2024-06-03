package com.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.Spring.configProperties.DevProperties;

public class InitClass implements CommandLineRunner{

	@Autowired
	DevProperties devProperties;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(devProperties.getName());
		
	}

}
