package com.springboot.practice.CourseApplication.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.practice.CourseApplication.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{

	List<Course> listOfCourses;
	
	
	public CourseServiceImpl() {
		super();
		listOfCourses = new ArrayList<>();
		listOfCourses.add(new Course(501,"Introduction to Java Core","This course is for beginner to start with Java","Coding Ninjas","Udemy"));
		listOfCourses.add(new Course(502,"Introduction to Java 8","This course willhelp you to understand features of Java 8 ","Coding Ninjas","Udemy"));
		listOfCourses.add(new Course(503,"Introduction to Maven","This course is for beginner to start with Maven","Coding Blocks","Coursera"));
		
	}



	@Override
	public List<Course> getCourse() {
		// TODO Auto-generated method stub
		return listOfCourses;
	}



	@Override
	public Course getCourseById(int courseId) {
		Course resultantCourse=null;
		for(Course tempCourse : listOfCourses) {
			if(tempCourse.getId()==courseId) resultantCourse=tempCourse;
		}
		return resultantCourse;
	}
	
	
	
	


	@Override
	public Course addCourse(int courseId, String courseTitle, String courseAuthor, String courseDescription,
			String courseSource) {
		listOfCourses.add(new Course(courseId,courseTitle,courseDescription,courseAuthor,courseSource));
		return getCourseById(courseId);
	}
	
}	
