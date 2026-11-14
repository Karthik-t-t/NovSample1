package org.testdata;

public class Example {

	int x = 10, y = 20, z = 30;

	private void m1() {

		System.out.println("Method--1");
		int a = 30, b = 20, c;
		c = a + b;
		System.out.println(c);

	}

	private void m2() {
		System.out.println("Method--2");
	}

	public static void main(String[] args) {
		String name = "Smartskills";
		int size = name.length();
		System.out.println("Size : " + size);

		System.out.println("Sample1");
	}
}
