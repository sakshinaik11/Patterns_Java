package com.jsp.Patterns;

public class P11 {

	public static void main(String args[]) {
		
		int n=5;
		
		for(int i=1; i<=n; i++) {
			
			//inner loop
			for(int j=1; j<=i; j++) {
				
				System.out.print(j%2);
			}
			
			System.out.println();
		}
	}

}
