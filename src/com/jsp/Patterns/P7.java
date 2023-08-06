package com.jsp.Patterns;

public class P7 {

	public static void main(String args[]) {
		int n = 5;
		//outer loop
		for(int i=1; i<=n; i++) {
			//inner loop
			
			for(int j=n; j>=1; j--) {
				
				System.out.print((char) (64+j));
			}
			System.out.println(" ");
		}
	}

}