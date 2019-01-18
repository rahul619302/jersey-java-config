package com.lti.rest.config.dao;

import java.util.ArrayList;
import java.util.List;

import com.lti.rest.config.pojo.Student;

public class StudentDao {

	private static List<Student> list = new ArrayList<>();
	static {
		list.add(new Student(1, "Rahul Singh"));
	}

	public static List<Student> getStudentList(Student student) {
		if (student != null)
			list.add(student);
		return list;
	}

}
