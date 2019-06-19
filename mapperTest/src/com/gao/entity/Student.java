package com.gao.entity;

import java.util.Date;

public class Student {
	//Ҫ�ͱ��е��ֶα���һ������
	private int id;
	private String name;
	private int age;
	private Date birth;
//����û��setget ����
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", birth=" + birth + "]";
	}


	public Student(int id, String name, int age, Date birth) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.birth = birth;
	}


	public Student() {
		super();
	}


	public Student( String name, int age, Date birth) {
		super();
		
		this.name = name;
		this.age = age;
		this.birth = birth;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Date getBirth() {
		return birth;
	}


	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	
	

}
