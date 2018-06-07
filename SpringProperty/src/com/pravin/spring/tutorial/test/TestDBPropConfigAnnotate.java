package com.pravin.spring.tutorial.test;

import java.util.Properties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pravin.spring.tutorial.config.AppConfig;
import com.pravin.spring.tutorial.config.DatabaseConfigAnnotate;

public class TestDBPropConfigAnnotate {
    public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	DatabaseConfigAnnotate config = context.getBean(DatabaseConfigAnnotate.class);
	Properties properties = config.getProperties();
	properties.forEach((k, v) -> {
	    System.out.println(k + " :: " + v);
	});
	context.close();
    }
}
