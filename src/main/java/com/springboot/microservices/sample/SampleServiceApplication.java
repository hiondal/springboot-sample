package com.springboot.microservices.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@SpringBootApplication
@RestController
public class SampleServiceApplication  {

	public static void main(String[] args) {
		
//        String profile = System.getProperty("spring.profiles.active");
//        if(profile == null) {
//            System.setProperty("spring.profiles.active", "dev");
//        }
        
		SpringApplication.run(SampleServiceApplication.class, args);
	}

	@ResponseBody
	@GetMapping(value = "/health")
	public String health() {
	   return "ok";
	}
	@ResponseBody
	@GetMapping(value = "/")
	public String index() {
	   return "Hello ! This is sample springboot application!!!";
	}

}
