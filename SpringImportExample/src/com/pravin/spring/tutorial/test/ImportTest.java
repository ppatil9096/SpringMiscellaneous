package com.pravin.spring.tutorial.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pravin.spring.tutorial.bean.MyBusinessService;
import com.pravin.spring.tutorial.bean.MyJDBCService;
import com.pravin.spring.tutorial.config.MyAppConfig;

public class ImportTest {
    public static void main(String[] args) {
	// ApplicationContext applicationContext=new ClassPathXmlApplicationContext();
	@SuppressWarnings("resource")
	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyAppConfig.class);
	MyJDBCService jdbcService = applicationContext.getBean("jdbcService", MyJDBCService.class);
	MyBusinessService businessService = applicationContext.getBean("bussService", MyBusinessService.class);

	jdbcService.createJDBCConnection();
	businessService.runMyBusiness();
    }
}
