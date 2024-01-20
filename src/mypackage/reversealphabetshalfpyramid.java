package mypackage;

import java.util.Scanner;

public class reversealphabetshalfpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the starting value for Pyramid :");
		char A = scanner.nextLine().charAt(0);
		System.out.println("Enter the Ending value for Pyramid :");
		char B = scanner.nextLine().charAt(0);
		for (char i=A;i>=B;i--)
		{
			for (char j=B;j<=i;j++)
			{
				//System.out.print(j+" ");//for printing the A, AB, ABC
				System.out.print(i+" ");//for printing the A, BB, CCC
				
				//System.out.print("*");//for printing the stars
				
			}
			System.out.println();
		}

	}

}
