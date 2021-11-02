package com.example.domain;

public class User {

	private String name;
	private Integer age;
	private String comment;
	
	//name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//age
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	//comment
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", Comment=" + comment + "]";
	}
	
	
}