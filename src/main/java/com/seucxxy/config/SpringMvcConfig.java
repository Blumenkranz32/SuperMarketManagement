package com.seucxxy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.seucxxy.controller","com.seucxxy.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
