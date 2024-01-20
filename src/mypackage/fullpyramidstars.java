package mypackage;

import java.util.Scanner;

public class fullpyramidstars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the starting value for Pyramid :");
		int A = scanner.nextInt();
		 for (int i = 1; i <= A; i++) {
	            // Print spaces before the stars
	            for (int k = 1; k <= A - i; k++) {
	                System.out.print(" ");
	            }
	            
	            // Print stars for the current row
	            for (int j = 1; j <= 2 * i - 1; j++) {
	                System.out.print("*");
	            }

	            System.out.println();
	        }

	}

}
