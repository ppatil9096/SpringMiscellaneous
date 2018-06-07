package com.pravin.spring.tutorial.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pravin.spring.tutorial.bean.MyDbConfigAnnotate;
import com.pravin.spring.tutorial.config.MyApplicationConfigAnnotate;

public class TestPropLoadDemoAnnotate {
    public static void main(String[] args) {
	AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
		MyApplicationConfigAnnotate.class);

	MyDbConfigAnnotate annotate = annotationConfigApplicationContext.getBean("dbConfig", MyDbConfigAnnotate.class);
	System.out.println(annotate.toString());
	annotationConfigApplicationContext.close();
    }
}
