package com.sb.kafka.springBootKafka.testapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@RequestMapping(value = "/")
	   public String hello() {
	      return "Hello SpringBoot-Kafka";
	   }

}
