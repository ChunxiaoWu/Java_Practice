package com.java.practice.object;

public class ReferenceObject implements Cloneable{
	private String name;
	public ReferenceObject(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
