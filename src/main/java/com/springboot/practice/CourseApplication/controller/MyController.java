package com.springboot.practice.CourseApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.practice.CourseApplication.entities.Course;
import com.springboot.practice.CourseApplication.service.CourseService;

@RestController
public class MyController {
	
	@Autowired
	CourseService courseService;
	
	
	@GetMapping("/courses")
	public List<Course> getCourses() {
		
		return this.courseService.getCourse();
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourseById(@PathVariable String courseId) {
		return this.courseService.getCourseById(Integer.parseInt(courseId));
	}
	
	
	//http://localhost:8080/courses/504/Introduction%20to%20Junit/Coding%20Blocks/Intro%20to%20JUnit/Coursera
	@GetMapping("/courses/{courseId}/{courseTitle}/{courseAuthor}/{courseDescription}/{courseSource}")
	public Course addCourse(@PathVariable String courseId,@PathVariable String courseTitle , @PathVariable String courseAuthor , @PathVariable String courseDescription, @PathVariable String courseSource) {
		return this.courseService.addCourse(Integer.parseInt(courseId),courseTitle,courseAuthor,courseDescription,courseSource);
	}
	
	
}
