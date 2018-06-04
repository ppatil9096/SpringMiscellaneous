package com.pravin.spring.tutorial.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pravin.spring.tutorial.bean.MyJDBCService;

@Configuration
public class JdbcConfig {
    @Bean("jdbcService")
    public MyJDBCService getJdbcService() {
	return new MyJDBCService();
    }
}
