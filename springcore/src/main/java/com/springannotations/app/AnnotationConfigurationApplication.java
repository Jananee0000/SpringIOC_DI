//Program to implement Dependency Injection using setter through annotations


package com.springannotations.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AnnotationConfigurationApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		MusicTeacher obj = context.getBean("getTeacherInfo",MusicTeacher.class);
		//System.out.println(obj.getTeacherInfo());
		obj.setName("Rahul Ravi");
		System.out.println(obj.getTeacherInfo());
		
		
	}

}
