package mypackage;

import java.util.Scanner;

public class alphabetshalfpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the starting value for Pyramid :");
		char A = scanner.nextLine().charAt(0);
		System.out.println("Enter the Ending value for Pyramid :");
		char B = scanner.nextLine().charAt(0);
		for (char i=A;i<=B;i++)
		{
			for (char j=A;j<=i;j++)
			{
				System.out.print(i+" ");//for A
				                         // BB this series
				System.out.print(j+" ");//for A
                // AB this series
				//ABC this series				
				//System.out.print("*");//for printing the stars
				
			}
			System.out.println();
		}
		
	}

	

}
