package com.leeroy;

public class Addition {
	public static int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 7;
		int result = add(num1, num2);
		System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
	}
}

