package com.example.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.Person;
import com.example.config.ProjectConfig;

public class SingletonScope {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Person per1 = context.getBean(Person.class);
		Person per2 = context.getBean(Person.class);
		
		System.out.println(per1.hashCode());
		System.out.println(per2.hashCode());
		if(per1 == per2) {
			System.out.println("Singleton Property satisfied");
		}

	}

}
