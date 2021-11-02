package com.example.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

public class UserForm {
	@NotBlank(message="名前は必須です")
	private String name;
	@Range(min=0,max=150,message="年齢の数値が不正です")
	private Integer age;
	@NotBlank(message="コメントは必須です")
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
		return "UserForm [name=" + name + ", age=" + age + ", Comment=" + comment + "]";
	}
	
	
}
