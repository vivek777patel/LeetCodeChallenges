package com.mypractice.java;

import java.util.Scanner;

public class Rate{
	public static void main(String[] args){

//MENU

	System.out.println("******************************************************");
	System.out.println("                         Menu                         ");
	System.out.println("******************************************************");
	System.out.println("1) Calculate Earnings at $10/hr");
	System.out.println("2) Calculate earnings at $0.10 doubled each hour");
	System.out.println("3) Exit");
	System.out.println("******************************************************");

//INTIALIZE SCANNER  AND DECLARE VARIABLE
	Scanner scan = new Scanner (System.in);
	int rate1 = 10;
	double rate2 = 0.1;
	int choice=0;
//WHILE STATEMENT W/ IF ELSE W/ FOR
		while (choice !=3){
			choice = scan.nextInt();	
			if (choice == 1) {
				System.out.println("How many hours?");		
				int hour = scan.nextInt();
				System.out.println("You will earn: $" + rate1*hour);
			}else if (choice == 2){
				System.out.println("How many hours");
				int hour = scan.nextInt();
				for (int i = 2; i <= hour; i++) {
					rate2+= rate2*2;
				}
				System.out.println("You will earn $ " + rate2);
			}else if(choice == 3) {
				break;
			}
			
		}
	}
}