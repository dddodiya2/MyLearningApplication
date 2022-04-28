package com.learning;

public class JavaLearning implements Learning {

	private String task;
	private String assignment;

	public JavaLearning() {
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
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getAssignment() {
		return assignment;
	}

	public void setAssignment(String assignment) {
		this.assignment = assignment;
	}

}
