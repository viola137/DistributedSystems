package com.esslingen.dsSystems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(servers= {@Server(url="/", description="Default Server URL")})
public class DsSystemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsSystemsApplication.class, args);
		// TODO add slf4j logger System.out.println("Here we go again:/");
		
		
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/rest/pets").allowedOrigins("http://localhost:4200").allowedMethods("PUT, POST, DELETE");
			}
		};
	}
}
