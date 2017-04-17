package com.zpl.service.impl;

import org.springframework.stereotype.Service;

import com.zpl.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public void sayHello() {
		System.out.println("ok");
	}

}
