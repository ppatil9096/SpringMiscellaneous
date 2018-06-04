package com.pravin.spring.tutorial.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pravin.spring.tutorial.bean.MyBusinessService;

@Configuration
public class BusinessConfig {
    @Bean("bussService")
    public MyBusinessService getBusinessService() {
	return new MyBusinessService();
    }
}
