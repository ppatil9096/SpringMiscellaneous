package com.pravin.spring.tutorial.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 
 * @author ppatil
 *
 */
@Component
public class DatabaseConfigAnnotate {
    private Properties properties;

    public Properties getProperties() {
	return properties;
    }

    /*
     * mention here which qualifier want to use from config file annotation
     *
     */
    @Autowired
    @Qualifier("orcldatabaseconfigprops")
    public void setProperties(Properties properties) {
	this.properties = properties;
    }

}
