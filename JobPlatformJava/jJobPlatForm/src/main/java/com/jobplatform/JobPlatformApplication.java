package com.jobplatform;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@MapperScan("com.jobplatform.*.mapper")
@SpringBootApplication
public class JobPlatformApplication {
	public static void main(String[] args) {
		SpringApplication.run(JobPlatformApplication.class, args);
	}
	
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/userInfo/getUser/{userId}").allowedOrigins("http://localhost:8081").allowCredentials(true);
				registry.addMapping("/login").allowedOrigins("http://localhost:8081").allowCredentials(true);
				registry.addMapping("/projectInfo/getProject").allowedOrigins("http://localhost:8081").allowCredentials(true);
				registry.addMapping("/taskInfo/getTaskInfoList").allowedOrigins("http://localhost:8081").allowCredentials(true);
				registry.addMapping("/taskInfo/processTask").allowedOrigins("http://localhost:8081").allowCredentials(true);
				registry.addMapping("/register").allowedOrigins("http://localhost:8081").allowCredentials(true);
			}
		};
	}

}
