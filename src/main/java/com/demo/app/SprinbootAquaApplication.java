package com.demo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.business.LogbackBusiness;
import com.demo.service.LogbackService;

@SpringBootApplication
public class SprinbootAquaApplication {

	public static void main(String[] args) {
		 LogbackService logbackService=new LogbackService();
	        logbackService.performSomeTask();
	        LogbackBusiness logbackBusiness = new LogbackBusiness();
	        logbackBusiness.performSomeTask();
		SpringApplication.run(SprinbootAquaApplication.class, args);
	}

}
