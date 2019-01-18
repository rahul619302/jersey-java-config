package com.lti.rest.with.jersey.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.lti.rest.config.dao.StudentDao;
import com.lti.rest.config.pojo.Student;

@Path("/student")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class StudentController {
	
	@GET
	@Path("/test/{name}")
	public String getMessageFromPath(@PathParam(value = "name") String name) {
		return "Hello "+name;
	}
	
	@GET
	@Path("/test")
	public String getMessageFromQuery(@QueryParam(value = "name") String name) {
		return "Hi "+name;
	}
	
	@POST
	@Path("/add")
	public Student add(Student student) {
		StudentDao.getStudentList(student);
		return student;
	}
	
	@GET
	@Path("/getStudents")
	public List<Student> getStudents() {
		StudentDao.getStudentList(null);
		return StudentDao.getStudentList(null);
	}

}
