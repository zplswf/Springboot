package com.zpl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zpl.service.HelloService;

@RestController
public class HelloController {

	@Autowired
	private HelloService helloService;
	
	@RequestMapping("/hello")
	public String index() {
		helloService.sayHello();
		return "Hello World";
	}
}
