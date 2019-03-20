package com.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FinalExam {

	public static void main(String[] args) throws FileNotFoundException {
		
		for(int i=1;i<=100;i++) {
			if(i%5==0) {
				System.out.println(i);
			}
			else {
				System.out.print(i + " ");
			}
		}
		/*int num = 6;
		increment(num);
		System.out.println(num);*/
		/*String s = "I dislike programming";
		int pos = s.indexOf("dislike");
		s = s.substring(0,pos)+ "like" + s.substring(pos+7);
		System.out.println(s);*/
		
		/*
		System.out.println(result(new int[] {5,2,7,1,10}));
		Scanner scan = new Scanner(new File("file.txt"));
		int grade=0,sum=0;
		while(scan.hasNextDouble()) {
			grade = scan.nextInt();
			sum += grade;
		}
		System.out.println(sum);
		
		for(int i=0;i<10;i++);
		//System.out.println(i);
		
		for(int r=0;r<2;r++) {
			for(int c=0;c<4;c++)
				System.out.print(" Hello ");
			System.out.println();
		}
		
		System.out.println("123"+4);
		int temp=1;
		for(int i=1;i<=100;i++) {
			if(temp==5) {
				System.out.print(i);
				System.out.println();
				temp=1;
				continue;
			}
			else {
				System.out.print(i+" ");
			}
			temp++;
			System.out.print(i+ " ");
			if(i%5==0) {
				System.out.println();
			}
		}
		String s = "asdf";
		Scanner sc =new Scanner(System.in);
		do {
			int score = sc.nextInt();
			
			if(score==999)
				break;
			System.out.println(score);
			
		}while(sc.hasNext());
		int score=0;
		do {
			score = sc.nextInt();
			System.out.println(score);
			
		}while(score!=999);
		System.out.println("Breaked Out of Loop");
		
		int val = sc.nextInt();
		while(val%2!=0) {
			val = sc.nextInt();
			System.out.println(val);
		}
		
		int x=10;
		 Remove ;
		 * if(x<0);x++;
		else x--;*/
	}
	
	public static void increment(int n) {
		n = n + 1;
	}
	public static int result(int[] a) {
		int k = 0;
		for(int i=1;i<a.length;i++) {
			if(a[i]<a[k]) {
				k=i;
			}
		}
		return a[k];
	}
}
