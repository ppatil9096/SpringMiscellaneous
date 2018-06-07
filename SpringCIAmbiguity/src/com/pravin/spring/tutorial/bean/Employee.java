package com.pravin.spring.tutorial.bean;

public class Employee {
    private String name;
    private String empId;
    private int age;

    public Employee(String name, String empId, int age) {
	this.name = name;
	this.empId = empId;
	this.age = age;
	System.out.println("First Constructor");
    }

    public Employee(String name, int age, String empId) {
	this.name = name;
	this.empId = empId;
	this.age = age;
	System.out.println("Second Constructor");
    }

    public String getName() {
	return name;
    }

    public String getEmpId() {
	return empId;
    }

    public int getAge() {
	return age;
    }

}
