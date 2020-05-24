package com.jobplatform.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.jobplatform.config.interceptor.LoginInterceptor;

public class WebConfigurer implements WebMvcConfigurer {
	
	@Autowired
    private LoginInterceptor loginInterceptor;
	
	  public void addInterceptors(InterceptorRegistry registry) {
		  registry.addInterceptor(loginInterceptor).addPathPatterns("/**").excludePathPatterns("/login", "/register");
	  }

}
