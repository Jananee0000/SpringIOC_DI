//Program to implement Dependency Injection using setter through annotations

package com.springannotations.app;

import org.springframework.context.annotation.Bean;



public class AppConfig {
	@Bean
	public MusicTeacher getTeacherInfo() {
		// TODO Auto-generated method stub
		return new MusicTeacher();
	}

}
