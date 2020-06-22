package com.data.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;

//import controller.DepartmentController;

@SpringBootApplication
// @ComponentScan(basePackages={"com.data.data.controller.DepartmentController"})
public class DataApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DataApplication.class, args);
	}

}
