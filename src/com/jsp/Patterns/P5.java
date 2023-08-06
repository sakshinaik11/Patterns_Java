package com.jsp.Patterns;

public class P5 {

	public static void main(String args[]) {
		int n = 5;
		//outer loop
		for(int i=1; i<=n; i++) {
			//inner loop
			
			for(int j=1; j<=n; j++) {
				
				System.out.print((char) (64+i));
			}
			System.out.println(" ");
		}
	}

}