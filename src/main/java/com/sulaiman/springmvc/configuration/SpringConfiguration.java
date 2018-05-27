package com.sulaiman.springmvc.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 
 * @author msulaiman
 * This class is mainly providing the component scanning and annotation support.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.sulaiman.springmvc")
public class SpringConfiguration {

}
