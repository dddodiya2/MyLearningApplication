package com.annotations.learning;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("lession1")
public class Lession implements LessionInterface {

	@Value("1")
	private int lessionNumber;
	@Value("Lession 1")
	private String lessionName;

	public Lession() {
	}

	public Lession(int lessionNumber, String lessionName) {
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
