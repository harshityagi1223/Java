package com.example.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.Animal;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;

public class Example1 {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		Animal veh = context.getBean(Animal.class);
		System.out.println(veh.getName());
		
	}
	

}
