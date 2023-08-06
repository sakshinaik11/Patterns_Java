package com.jsp.Patterns;

public class P10 {

	public static void main(String args[]) {
		int n = 5;
		//outer loop
		for(int i=1; i<=n; i++) {
			//inner loop
			
			for(int j=1; j<=n; j++) {
				
				// CELL 
				if(i==1 || j == 1 || i==n || j == n) {
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
				
				System.out.println();
			}
			
		}
   }
	
}

