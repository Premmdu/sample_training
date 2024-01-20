package mypackage;
import java.util.*;
public class starhalfpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value for Pyramid :");
		int A = scanner.nextInt();
		for (int i=1;i<=A;i++)
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
