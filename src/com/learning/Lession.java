package com.learning;

public class Lession {

	private int lessionNumber;
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
