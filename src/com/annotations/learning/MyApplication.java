package com.annotations.learning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyApplicationConfig.class);

		Learning learning1 = (Learning) context.getBean("javaLearning");

		learning1.geTask();

		Learning learning2 = (Learning) context.getBean("springLearning");

		learning2.geTask();

		Learning learning3 = (Learning) context.getBean("learningForClass1");

		learning3.geTask();

		context.close();

	}

}
