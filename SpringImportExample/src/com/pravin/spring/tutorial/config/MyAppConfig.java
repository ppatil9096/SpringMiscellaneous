package com.pravin.spring.tutorial.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ JdbcConfig.class, BusinessConfig.class })
public class MyAppConfig {

}
