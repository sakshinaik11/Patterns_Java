package com.jsp.Patterns;

public class P9_112 {

	public static void main(String args[]) {
		
		// 1
		// 2 2
		// 3 3 3 
		
		int n=5;
		
		for(int i=1; i<=n; i++) {
			
			//inner loop
			for(int j=1; j<=i; j++) {
				
				System.out.print(j);
			}
			
			System.out.println();
		}
	}

}