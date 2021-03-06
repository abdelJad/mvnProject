package com.abd.jad.entity;

public class Person {
	private String name;
	private String prenom;
	private int age;

	public Person() {
	}

	public Person(String name, String prenom, int age) {
		super();
		this.name = name;
		this.prenom = prenom;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", prenom=" + prenom + ", age=" + age
				+ "]";
	}

}
