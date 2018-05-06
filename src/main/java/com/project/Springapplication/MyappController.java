package com.project.Springapplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyappController {
	
	@RequestMapping("/welcome")
	public String welcomeMsg(){
		return "Welcome to my spring boot application";
	}

}
