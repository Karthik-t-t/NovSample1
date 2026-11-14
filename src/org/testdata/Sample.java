package org.testdata;

public class Sample {
	
	private void m1() {
		System.out.println("m1 - method");
	}

	public static void main(String[] args) {
		
		Sample s = new Sample();
		s.m1();
	}
}
