package com.jsp.Patterns;

public class P12 {

	public static void main(String args[]) {
		
		// 5 4 3 2 1 
		// 5 4 3 2
		
		int n=5;
		
		for(int i=1; i<=n; i++) {
			
			//inner loop
			for(int j=n; j>=i; j--) {
				
				System.out.print(j);
			}
			
			System.out.println();
		}
	}

}
