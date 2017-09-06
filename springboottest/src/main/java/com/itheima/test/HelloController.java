package com.itheima.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

	@Autowired
	private Environment envionment;
	@Value("${name}")
	private String names;
	@Value("${url}")
	private String urls;
	@GetMapping("/hello")
	@ResponseBody
	public String test(){
	
		System.out.println(envionment.getProperty("name"));
		System.out.println(envionment.getProperty("url"));
		System.out.println(names);
		System.out.println(urls);
		
		return "/html/user.html";
	}
	
	@GetMapping("/user")
	public String user(){
		
		return "/html/user.html";
	}
	
	
	
	
	
	
	
	
}
