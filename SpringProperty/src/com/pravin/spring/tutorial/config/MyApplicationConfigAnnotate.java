package com.pravin.spring.tutorial.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.pravin.spring.tutorial.bean.MyDbConfigAnnotate;

@Component
@PropertySource("classpath:/db.properties")
public class MyApplicationConfigAnnotate {
    @Autowired
    Environment environment;

    @Bean(name = "dbConfig")
    public MyDbConfigAnnotate getMyDbConfig() {
	MyDbConfigAnnotate config = new MyDbConfigAnnotate();
	config.setDbHost(environment.getProperty("db.host.url"));
	config.setDbUrl(environment.getProperty("db.port.number"));
	config.setDbPassword(environment.getProperty("db.service.name"));
	config.setDbService(environment.getProperty("db.user"));
	config.setDbPort(environment.getProperty("db.password"));
	return config;
    }
}
