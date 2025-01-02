//Program to implement Dependency Injection using setter through annotations


package com.springannotations.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class MusicTeacher implements Teacher {
	@Value("Rahul")
	private String name;
	@Value("10")
	private int yearsOfExperience;
	@Value("M. Phil. Vocal and Instrumental")
	private String qualification;
	@Value("Punjab University")
	private String university;

	public MusicTeacher() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getTeacherInfo() {
		// TODO Auto-generated method stub
		return "Music Teacher (Name: " + name + ", Experience in years: " + yearsOfExperience + ", Qualification: "
				+ qualification + ", University: " + university + ") ";
	}

}
