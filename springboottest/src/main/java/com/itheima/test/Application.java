package com.itheima.test;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 这个注解代表为SpringBoot应用的运行主类
public class Application {

	public static void main(String[] args) {
		
		// 运行SpringBoot应用
	//	SpringApplication.run(Application.class, args);
		
		SpringApplication application = new SpringApplication(Application.class);
		
		// 设置横幅模式
		application.setBannerMode(Banner.Mode.OFF);
		
		application.run(args);
		
	}
}
