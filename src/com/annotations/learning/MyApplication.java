package com.annotations.learning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyApplicationConfig.class);

		/*
		 * JavaLearning learning1 = (JavaLearning) context.getBean("javaLearning");
		 * learning1.geTask(); learning1.setTask("New task modified");
		 * learning1.geTask();
		 */
		
		JavaLearning learning11 = (JavaLearning) context.getBean("javaLearning");
		learning11.geTask();
		learning11.getApplicationName();
		
		
		/*
		 * Learning learning2 = (Learning) context.getBean("springLearning");
		 * 
		 * learning2.geTask();
		 * 
		 * Learning learning3 = (Learning) context.getBean("learningForClass1");
		 * 
		 * learning3.geTask();
		 */

		context.close();

	}

}
