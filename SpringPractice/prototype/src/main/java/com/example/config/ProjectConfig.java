package com.example.config;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.beans.Person;
@Configuration
@ComponentScan(basePackages= "com.example.beans")
public class ProjectConfig {
	//@Bean
	Person person() {
		Person person = new Person();
		return person;
	}
	
}
