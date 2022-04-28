package com.learning;

public class SpringLearning implements Learning {

	private String task;
	private String assignment;

	public SpringLearning() {
		this.task = "Default Spring task - practice concepts";
		this.assignment = "Default Spring assignment";
	}

	public SpringLearning(String task, String assignment) {
		this.task = task;
		this.assignment = assignment;
	}

	@Override
	public void geTask() {
		System.out.println("Spring");
		System.out.println("task : " + task + "\nassignment : " + assignment);
	}

	public String getTask() {
		return task;
	}

	public String getAssignment() {
		return assignment;
	}

}
