package com.annotations.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JavaLearning implements Learning {

	@Value("Learn Java collections")
	private String task;
	@Value("Write a program to demonstrate collection concepts")
	private String assignment;

	@Autowired
	@Qualifier("javaLession")
	private LessionInterface lession;

	public JavaLearning() {
		System.out.println("JavaLearning  default constructor called");
		this.task = "Default Java task - practice concepts";
		this.assignment = "Default Java assignment";
	}

	public JavaLearning(String task, String assignment) {
		this.task = task;
		this.assignment = assignment;
	}

	@Override
	public void geTask() {
		System.out.println("Java");
		System.out.println("task : " + task + "\nassignment : " + assignment);
		System.out.println("lession : " + lession.getLessionNumber() + " " + lession.getLessionName());
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		System.out.println("JavaLearning setTask method called");
		this.task = task;
	}

	public String getAssignment() {
		return assignment;
	}

	public void setAssignment(String assignment) {
		System.out.println("JavaLearning setAssignment method called");
		this.assignment = assignment;
	}

	public LessionInterface getLession() {
		return lession;
	}

	public void setLession(Lession lession) {
		System.out.println("JavaLearning setLession method called");
		this.lession = lession;
	}

	public void initJavaBean() {
		System.out.println("initJavaBean method called");
	}

	public void destroyJavaBean() {
		System.out.println("destroyJavaBean method called");
	}

}
