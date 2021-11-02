package com.example.domain;

import java.util.List;

public class Member {

	private Integer id;
	private String name;
	private Integer age;
	private Integer dep_id;
	
	
	//tostring
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", age=" + age + ", dep_id=" + dep_id + "]";
	}

	//getter setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getDep_id() {
		return dep_id;
	}

	public void setDep_id(Integer dep_id) {
		this.dep_id = dep_id;
	}

	private List<Member> memberList;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public List<Member> getMemberList() {
		return memberList;
	}

	public void setMemberList(List<Member> memberList) {
		this.memberList = memberList;
	}
}
