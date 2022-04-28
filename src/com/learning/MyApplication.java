package com.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanConfiguration.xml");

		Learning learning1 = (Learning) context.getBean("javaLearning");

		learning1.geTask();

		Learning learning2 = (Learning) context.getBean("springLearning");

		learning2.geTask();

		context.close();

	}

}
