package com.pravin.spring.tutorial.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author ppatil
 *
 */
@Configuration
@ComponentScan(basePackages = "com.pravin.spring.tutorial.config")
public class AppConfig {

    @Bean
    @Qualifier("mysqldatabaseconfigprops")
    public Properties getMySqlDatabaseConfig() {
	Properties props = new Properties();
	props.setProperty("driverClassName", "com.mysql.jdbc.Driver");
	props.setProperty("url", "jdbc:mysql://localhost:3306/db");
	props.setProperty("username", "pp");
	props.setProperty("password", "ppabcd");
	return props;
    }

    @Bean
    @Qualifier("orcldatabaseconfigprops")
    public Properties getOracleDatabaseConfig() {
	Properties props = new Properties();
	props.setProperty("driverClassName", "oracle.jdbc.driver.OracleDriver");
	props.setProperty("url", "jdbc:oracle:thin:@abc:1521:db");
	props.setProperty("username", "pp");
	props.setProperty("password", "ppabcd");
	return props;
    }
}
