package com.sp.beans;

public class Student {
	
	private String name;
	private int rollnum;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}

	public void Display() {
		System.out.println("-----------------name----"+name);
		System.out.println("-----------------rollnum----"+rollnum);
	}
}
