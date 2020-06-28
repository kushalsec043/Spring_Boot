package com.springboot10steps.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication

//Atomatic scan of specific package
public class SpringbootApplication
{

	public static void main(String[] args) 
	{
		ApplicationContext applicationcontext =
				SpringApplication.run(SpringbootApplication.class, args);
	
		for(String name : applicationcontext.getBeanDefinitionNames())
		{
			System.out.println(name);
		}
	}

}
