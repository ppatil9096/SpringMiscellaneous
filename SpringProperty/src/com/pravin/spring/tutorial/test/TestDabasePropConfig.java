package com.pravin.spring.tutorial.test;

import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pravin.spring.tutorial.bean.DatabaseConfig;

public class TestDabasePropConfig {
    public static void main(String[] args) {
	@SuppressWarnings("resource")
//	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("propertiesBeans.xml");
	DatabaseConfig config = applicationContext.getBean("dbConfig", DatabaseConfig.class);

	Properties properties = config.getProperties();
	properties.forEach((k, v) -> {
	    System.out.println(k + " :: " + v);
	});
    }
}
