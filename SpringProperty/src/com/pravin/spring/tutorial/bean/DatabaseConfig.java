package com.pravin.spring.tutorial.bean;
/**
 * 
 * @author ppatil
 *
 */

import java.util.Properties;

public class DatabaseConfig {
    private Properties properties;

    public void setProperties(Properties properties) {
	this.properties = properties;
    }

    public Properties getProperties() {
	return properties;
    }

}
