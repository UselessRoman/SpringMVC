package com.wjc.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.wjc.controller","com.wjc.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
