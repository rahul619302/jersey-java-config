package com.lti.rest.config.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {

	private int roll;
	private String name;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
