package com.java.practice.object;

public class TestClone  implements Cloneable{
	
	public void test() throws CloneNotSupportedException {
		super.clone();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		TestClone test = new TestClone();
		test.test();
	}

}
