package com.mypractice.java;

public class HourCompare {

	public static void main(String[] args) {
		// identify and declare rates

		int rate1 = 10;
		double rate2 = 0.10;

		int compare = 0;
		// for statement to determine which to use
		for (int i = 2; rate1 > rate2; i++) {
			rate1 = 10 * i;
			rate2 = rate2 * 2 + 0.1;
			compare = i;
		}
		System.out.println(compare);
	}
}
