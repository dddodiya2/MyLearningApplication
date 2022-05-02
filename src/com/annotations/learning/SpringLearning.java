package com.annotations.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringLearning implements Learning {

	@Value("Spring task")
	private String task;
	@Value("Spring assignment")
	private String assignment;
	
	private Lession lession;

	public SpringLearning() {
		System.out.println("Spring def contructor called");
		this.task = "Default Spring task - practice concepts";
		this.assignment = "Default Spring assignment";
	}
	
	@Autowired
	public SpringLearning(Lession lession) {
		System.out.println("Spring paramterised contructor called");
		this.lession = lession;
	}

	@Override
	public void geTask() {
		System.out.println();
		System.out.println("Spring");
		System.out.println("task : " + task + "\nassignment : " + assignment);
		System.out.println("lession : " + lession.getLessionNumber() + " " + lession.getLessionName());
	}

	public String getTask() {
		return task;
	}

	public String getAssignment() {
		return assignment;
	}

	public Lession getLessionIshwari() {
		return lession;
	}

	public void setLessionIshwari(Lession lessionIshwari) {
		this.lession = lessionIshwari;
	}
	
	
	public void initSpringBean() {
		System.out.println("initSpringBean method called");
	}
	
	public void destroySpringBean() {
		System.out.println("destroySpringBean method called");
	}
	
	
}
