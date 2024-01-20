package mypackage;

import java.util.Scanner;

public class fullpyramidnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the starting value for Pyramid :");
		int A = scanner.nextInt();
		for (int i=1;i<=A;i++)
		{
			 for (int k = 1; k <= A - i; k++) {
	                System.out.print("  ");
	            }
			 for (int j=1;j<=i;j++)
				{
					//System.out.print(i+" ");//for printing the numbers
					System.out.print("*");//for printing the stars
					
				}
			 for (int j = i - 1; j >= 1; j--) {
	               // System.out.print(i + " ");
	                System.out.print("*");
	            }
				System.out.println();
		}

	}

}
