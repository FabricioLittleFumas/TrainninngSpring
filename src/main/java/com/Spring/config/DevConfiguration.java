package com.Spring.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.Spring.configProperties.DevProperties;

@Configuration
@EnableConfigurationProperties(value = DevProperties.class)
public class DevConfiguration {

}
