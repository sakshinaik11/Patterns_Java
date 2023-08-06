package com.jsp.Patterns;

public class P3 {


		public static void main(String args[]) {
			
			int n=5;
			
			// OUTER LOOP
			
			for(int i=1; i<=n; i++) {
				
				//inner loop space 
				for(int s=1; s<=n-i; s++) {
					
					System.out.print("");
				}
				
				// inner loop stars
				for(int j=1; j<=i; j++) {
					
					System.out.print(" * ");
					
				}
				System.out.println();
				
			}
		}

}
