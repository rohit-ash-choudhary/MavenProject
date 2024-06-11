package com.sp.JavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sp.beans.Student;

@Configuration
public class JavaConfig {

	
	@Bean
	public Student stdObj() {
		
		Student std=new Student();
		std.setName("Rohit");
		std.setRollnum(43534);
		return std;
		
	}
}
