package com.spring;

public class Employee {
	private int id;
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
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	private String name;
	private int sal;
	
	public void show()
	{
		System.out.print("Employee ID :"+getId()+"\tEmployee Name :"+getName()+"\tEmployee Salary :"+getSal());
	}
	
}
