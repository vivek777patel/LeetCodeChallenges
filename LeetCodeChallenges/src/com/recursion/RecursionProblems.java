package com.recursion;

import java.util.Arrays;

import jdk.nashorn.internal.runtime.FindProperty;

public class RecursionProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// printFun(3);
		/*
		 * System.out.println(practice1(5, 2)); // x(x+1)/2 + y int[] arr = { 5, 9, 2, 7
		 * }; practice2(arr, 0, 3); // Recursive selection sort --> In place sorting
		 * System.out.println(Arrays.toString(arr));
		 */
		// System.out.println(practice3(10)); // log2(n);
		// practice4(7); // Decimal to Binary
		// practice5(5); // Pyramid
		// practice5_1(5); // Pyramid
		// System.out.println(practice6(5));
		// practice7(4);
		// Immediate 8 to left counts double
		/*
		 * System.out.println(count8(818)); System.out.println(count8(888));
		 */

		/*int a[] = new int[5];
		int b[] = new int[5];

		b[0] = 1;
		b[1] = 2;
		b[2] = 3;
		b[3] = 4;
		b[4] = 5;
		Object o = new Object();
		a = b;
		if (a == b) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		a[0] = 2;

		System.out.println(Arrays.toString(a) + " : " + Arrays.toString(b));*/
		//System.out.println(changeXY("codex"));
		//System.out.println(endX("xxhix"));
		
		String str = "xyzxyz";
		System.out.println(str.indexOf("xyz"));
		/*int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
		System.out.println(findFirstMissing(arr, 0, arr.length-1));*/
	}

	public static int findFirstMissing(int[] arr, int st, int end) {
		if(st>end)
			return end+1;
		if(st != arr[st]) {
			return st;
		}
		int mid = (st+end)/2;
		if(mid==arr[mid])
			return findFirstMissing(arr, mid+1, end);
		return findFirstMissing(arr, st, mid);
	}
	
	public boolean xyzThere(String str) {
		if (str.length() >= 3) {
			if (str.substring(0, 3).equals("xyz"))
				return true;
			for (int i = 0; i < str.length() - 3; i++) {
				if (str.substring(i + 1, i + 4).equals("xyz") && str.charAt(i) != '.')
					return true;
			}
		}
		return false;
	}
	
	public static String endX(String str) {
		if (str.length() == 0)
			return str;
		if (str.charAt(0) == 'x')
			return endX(str.substring(1)) + 'x';

		return str.charAt(0) + endX(str.substring(1));
	}

	public static String changeXY(String str) {
		if (str.equals(""))
			return str;
		if (str.charAt(0) == 'x')
			return "y" + changeXY(str.substring(1));
		return str.charAt(0) + changeXY(str.substring(1));
	}

	public static int count8(int n) {
		return count8TR(n, 0);
	}

	public static int count8TR(int n, int prev) {
		int rem = n % 10;
		int div = n / 10;
		if (div == 0) {
			if (prev == 8 && rem == 8) {
				return 2;
			} else if (rem == 8) {
				return 1;
			}
			return 0;
		}
		if (prev == 8 && rem == 8) {
			return 2 + count8TR(div, rem);
		} else if (rem == 8) {
			return 1 + count8TR(div, rem);
		}
		return count8TR(div, rem);
	}

	public static void practice7(int x) {
		if (x > 0) {
			// System.out.println("my val : "+x);
			practice7(--x);
			System.out.print(x + "\t");
			practice7(--x);
			// System.out.println();
		}
	}

//	#define LIMIT 1000 
	public static int practice6(int n) {
		if (n <= 0)
			return n;
		if (n > 1000)
			return n;
		System.out.println(n);
		int val = practice6(2 * n);
		// System.out.println(val + " val:n " + n);
		return val;
	}

	public static void practice5_1(int n) {
		int i = 0;
		for (i = 0; i < n; i++)
			System.out.print("* ");
		System.out.println();
		if (n > 1)
			practice5_1(n - 1);
	}

	public static void practice5(int n) {
		int i = 0;
		if (n > 1)
			practice5(n - 1);
		for (i = 0; i < n; i++)
			System.out.print("* ");
		System.out.println();
	}

	public static void practice4(int n) {
		if (n == 0)
			return;

		practice4(n / 2);
		System.out.println(n + " n:n%2 " + n % 2);
	}

	public static int practice3(int n) {
		if (n == 1)
			return 0;
		else {
			System.out.println(n);
			int val = 1 + practice3(n / 2);
			System.out.println(val);
			return val;
		}
	}

	public static void practice2(int[] arr, int st_index, int end_index) {
		if (st_index >= end_index)
			return;
		int min_index = 0, temp = 0;
		min_index = getMinValIndex(arr, st_index, end_index);
		temp = arr[st_index];
		arr[st_index] = arr[min_index];
		arr[min_index] = temp;
		practice2(arr, st_index + 1, end_index);
	}

	public static int getMinValIndex(int[] arr, int st_index, int end_index) {
		int minVal = arr[st_index];
		int minValIndex = st_index;
		while (st_index <= end_index) {
			if (minVal > arr[st_index]) {
				minVal = arr[st_index];
				minValIndex = st_index;
			}
			st_index++;
		}
		return minValIndex;
	}

	public static void printFun(int num) {
		if (num < 1)
			return;
		else {
			System.out.println(num);
			printFun(num - 1);
			System.out.println(num);
		}
	}

	public static int practice1(int x, int y) {
		if (x < 1)
			return y;
		System.out.println(x + " : xy :" + y);
		return practice1(x - 1, x + y);
	}

}
