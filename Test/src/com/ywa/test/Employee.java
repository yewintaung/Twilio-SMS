package com.ywa.test;
public class Employee {

	private String name;
	private String group;

	public Employee() {
	}

	public Employee(String name, String group) {
		this.name = name;
		this.group = group;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

}
