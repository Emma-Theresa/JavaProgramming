package com.ilpbatch4.utility;

public class FactorialOfNumber {

	public static void main(String[] args) {
	  int input=5;
	  factorialOfNumber(input);

	}

	private static void factorialOfNumber(int input) {
		int factorial=1;
		for(int i=1;i<=input;i++) {
			factorial=factorial*i;
		}
		System.out.println("factorial is : "+ factorial);
	}

}
