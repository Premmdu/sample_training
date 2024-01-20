package mypackage;

import java.util.Scanner;

public class reversehalfpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value for Pyramid :");
		int A = scanner.nextInt();
		for (int i=A;i>=1;i--)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(j+" ");//for printing the numbers
				//System.out.print("*");//for printing the stars
				
			}
			System.out.println();
		}

	}

}
