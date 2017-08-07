package com.example.springbootsamplehelloworld;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
	@RequestMapping("/")
	public String helloworld(){
		return "Hello World";
	}
	
	@RequestMapping("/hello/{name}")
	public String helloName(@PathVariable String name){
		return "Hello "+name;
	}

}
