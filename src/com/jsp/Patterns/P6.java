package com.jsp.Patterns;

public class P6 {

	public static void main(String args[]) {
		int n = 5;
		//outer loop
		for(int i=1; i<=n; i++) {
			//inner loop
			
			for(int j=n; j>=i; j--) {
				
				System.out.print((char) (64+j));
			}
			System.out.println(" ");
		}
	}

}