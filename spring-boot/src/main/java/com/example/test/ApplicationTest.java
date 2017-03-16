package com.example.test;

import java.text.DateFormat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class ApplicationTest {

	@RequestMapping("/helloWorld")
	public String helloWorld(){
		return "Hello World!";
	}
	
	@RequestMapping("/now")
	public String now() {
		DateFormat formatter = DateFormat.getDateTimeInstance();
        return "现在时间：" + formatter.format(this);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationTest.class, args);
	}

}
