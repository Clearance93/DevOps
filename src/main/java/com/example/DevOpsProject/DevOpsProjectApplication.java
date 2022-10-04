package com.example.DevOpsProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableAutoConfiguration(exclude=(DataSourceAutoConfiguration.class))
@SpringBootApplication
public class DevOpsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevOpsProjectApplication.class, args);
	}

}


//<groupId>org.springframework.boot</groupId>
//<artifactId>spring-boot-maven-plugin</artifactId>