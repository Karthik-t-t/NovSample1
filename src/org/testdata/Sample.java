package org.testdata;

public class Sample {
	
	private void m1() {
		System.out.println("m1 - method");
	}
	
	private void m2() {
		System.out.println("m21 - method");
	}

	public static void main(String[] args) {
		
		Sample s = new Sample();
		s.m1();
	}
}
