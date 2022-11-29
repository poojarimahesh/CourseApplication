package com.springboot.practice.CourseApplication.service;

import java.util.List;

import com.springboot.practice.CourseApplication.entities.Course;

public interface CourseService {
	
	public List<Course> getCourse();
	public Course getCourseById(int courseId);
	public Course addCourse(int courseId ,String courseTitle,String courseAuthor , String courseDescription , String courseSource);
}
