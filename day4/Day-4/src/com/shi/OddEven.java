package com.shi;

public class OddEven {
	 
	
	void oddEven(int v) {
		
		if(v<0) System.out.println("Error");
		
	    else if(v%2==1) System.out.println(v);
		
		else System.out.println(10 + (int)(Math.ceil(v/10))*10);
		
	}

	public static void main(String[] args) {
		
		OddEven d1 = new OddEven();
		
		d1.oddEven(46);	

	}

}
