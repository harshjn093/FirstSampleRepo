package com.example.project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class TestController {
	
	@RequestMapping(method= RequestMethod.GET,value="/test")
	public String helloWorld() {
		return "Success";
	}

}
