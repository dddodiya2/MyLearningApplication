package com.annotations.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.annotations.learning")
@PropertySource("initialValues.properties")
public class MyApplicationConfig {
	
	@Bean("learningForClass1")
	public Learning getLearningForClass1() {
		return new Learning() {
			
			@Override
			public void geTask() {
				System.out.println("Class 1 learning task");			
			}
		};
	}

}
