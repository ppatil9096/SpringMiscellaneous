package com.pravin.spring.tutorial.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pravin.spring.tutorial.bean.MyDbConfig;

public class TestReadPropertyFile {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("readPropertyFile.xml");
	MyDbConfig config = applicationContext.getBean("dbConfig", MyDbConfig.class);
	System.out.println(config.toString());
    }
}
