package com.luv2code.springboot.demo.mycoolapp;

//BootStrap your Spring application
import org.springframework.boot.SpringApplication;
//Enables auto configuration, component scanning, additional configuration. It is composed of following annotations.
//@EnableAutoConfiguration, @ComponentScan, @Configuration
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//(scanBasePackages= {"com.luv2code.springboot.demo.mycoolapp",, <other packages to scan other than root package>})
public class MycoolappApplication {

	public static void main(String[] args) {
		//BootStrap your Spring application. Behind the scenes, Spring creates application context, does component scanning
		//and registers all the beans, Starts the embedded server(like tomcat etc)
		SpringApplication.run(MycoolappApplication.class, args);
	}
}
