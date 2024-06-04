package com.ilpbatch4.utility;

public class SumOfSeries {

	public static void main(String[] args) {
     int input=10;
   
     SumOfTheSeries(input);

	}
	private static void SumOfTheSeries(int input) {
		int sum=0;
		for(int i=1;i<=input;i++) {
			sum = sum + i;
		}
	System.out.println("The sum of the series is: "+sum );
	}

}
