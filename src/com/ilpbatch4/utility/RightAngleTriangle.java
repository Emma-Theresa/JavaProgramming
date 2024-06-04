package com.ilpbatch4.utility;

public class RightAngleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=5;
		rightAngle(input);

	}

	private static void rightAngle(int input) {
		// TODO Auto-generated method stub
		for (int i=0; i<input; i++) {
			for (int j=0; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
