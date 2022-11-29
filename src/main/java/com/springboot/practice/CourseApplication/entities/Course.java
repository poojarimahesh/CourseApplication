package com.springboot.practice.CourseApplication.entities;

public class Course {
	private int id;
	private String title;
	private String author;
	private String description;
	private String source;
	
	public Course(int id, String title, String author, String description, String source) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.description = description;
		this.source = source;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", author=" + author + ", description=" + description
				+ ", source=" + source + "]";
	}
	
}
