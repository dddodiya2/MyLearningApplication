package com.annotations.learning;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JavaLession implements LessionInterface {

	@Value("1")
	private int lessionNumber;
	@Value("Java Lession 1")
	private String lessionName;

	public JavaLession() {
	}

	public JavaLession(int lessionNumber, String lessionName) {
		this.lessionNumber = lessionNumber;
		this.lessionName = lessionName;
	}

	public int getLessionNumber() {
		return lessionNumber;
	}

	public void setLessionNumber(int lessionNumber) {
		this.lessionNumber = lessionNumber;
	}

	public String getLessionName() {
		return lessionName;
	}

	public void setLessionName(String lessionName) {
		this.lessionName = lessionName;
	}

}
