package com.mypractice.java;

public class TwoStacks {

	int[] arr;
	int top1, top2;
	int size;

	public TwoStacks(int n) {
		size = n;
		// As initially there's no element
		top1 = -1;
		top2 = n;
		arr = new int[size];
	}

	public void push1(int n) {
		if (top1 < top2 - 1) {
			top1++;
			arr[top1] = n;
		}
	}

	public void push2(int n) {
		if (top1 < top2 - 1) {
			top2--;
			arr[top2] = n;
		}
	}

	public int pop1() {
		if (top1 >= 0) {
			int n = arr[top1];
			top1--;
			return n;
		}
		return Integer.MIN_VALUE;
	}

	public int pop2() {
		if (top2 < size) {
			int n = arr[top2];
			top2++;
			return n;
		}
		return Integer.MIN_VALUE;
	}

	public static void main(String args[]) {
		TwoStacks ts = new TwoStacks(5);
		ts.push1(5);
		ts.push2(10);
		ts.push2(15);
		ts.push1(11);
		ts.push2(7);
		ts.push2(40);
		System.out.println("Popped element from" + " stack1 is " + ts.pop1());
		System.out.println("Popped element from" + " stack2 is " + ts.pop2());
		System.out.println("Popped element from" + " stack1 is " + ts.pop1());
		System.out.println("Popped element from" + " stack1 is " + ts.pop1());
	}
}
