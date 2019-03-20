package com.practice;

public class MyInterfaceImpl implements MyInterface, MyIntf {

	@Override
	public void myMethod() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String args[]) {
		/*int input = 69;
		switch(input/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
		case 7:
			System.out.println("B");
			break;
		default:
			System.out.println("C");
		}*/
		
		/*int x=0;
		while(x<100) {
			x=x*2;
		}
		System.out.println(x);*/
		
		/*for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		String text="I think that I shall never see";
		
		for(int i=0;i<text.length();i++) {
			char ch = text.charAt(i);
			if(ch=='e') {
				System.out.print('-');
			}
			else
				System.out.print(ch);
			
		}
		
	}

}
