package com.pravin.spring.tutorial.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pravin.spring.tutorial.bean.Employee;

public class TestEmployee {
    public static void main(String[] args) {
	@SuppressWarnings("resource")
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
	Employee employee = applicationContext.getBean("employee", Employee.class);
	System.out.println(employee.getName() + " " + employee.getEmpId() + " " + employee.getAge());
    }
}
/***
 * Output 1 (without mentioning type) ::
 * First Constructor 
 * Name : John 
 * EmpId : 21 
 * Age : 1000
 * ******************************
 * Output 2 (with mentioning type) ::
 * First Constructor 
 * Name : John 
 * EmpId : 1000
 * Age : 21  
 * ******************************
 * Output 3 (with mentioning index) ::
 * Second Constructor 
 * Name : John 
 * EmpId : 1000
 * Age : 21
 */
