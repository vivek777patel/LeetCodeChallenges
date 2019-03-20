package com.recursion;

public class B extends A {
	int k;
	public static void main(String[] args) {
		/*B b1 = new B();
		b1.k = 10;
		B b2 = new B();
		b2.k = 5;
		System.out.println(b1.compareTo(b2));*/
		
		/*int x = 15;
		int y = 10;
		int z = 19;
		// 				AND/ OR
	      if( !(x <= 10) || (y<=10 && z == 10)) {
	         System.out.print("Value of X and y is less than 10");
	      }
	      else if( x >= 20 ) {
	         System.out.print("Value of X is 20");
	      }
	      else if( x == 30 ) {
	         System.out.print("Value of X is 30");
	      }else {
	         System.out.print("This is else statement");
	      }*/
	 
	      //int x = 10;

	      /*while( x < 20 ) {
	         System.out.print("value of x : " + x );
	         x++; // increment operator
	         // x = x + 1;
	         System.out.print("\n");
	      }*/
	      
		int n1 = 10;
		int n2 = 12;
		
		if(n1%2 == 0 && n2%2==0)
		{
			
		}
		else {
			
		}
	      
		for(int x = 10; x < 20; x++) {
	    	  System.out.println("From For value of x : " + x );
	      }
	}
	
	public boolean bothEven(int n1, int n2) {
		/*if(n1%2 == 0 && n2%2==0)
		{
			return true;
		}
		else {
			return false;
		}*/
		return (n1%2 == 0 && n2%2==0);
	}
	
	// did u understand the typecast-- why we used it
	public int compareTo(Object o) {
		B temp1 = (B)o; // typecast
		B temp2 = (B)this; // typecast
		
		if(temp1.k > temp2.k)
			return -1;
		else if(temp1.k < temp2.k)
			return 1;
		return 0;
	}
}
