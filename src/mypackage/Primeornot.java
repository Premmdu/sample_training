package mypackage;

import java.util.Scanner;

public class Primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the number : ");
		int A = scanner.nextInt();
		if(isprime(A))
		{
			System.out.println("Entered number : " + A + "is Prime");
		}
		else
		{
			System.out.println("Entered number : " + A + "is not a Prime");
		}
				
		
	}

	private static boolean isprime(int a) {
		// TODO Auto-generated method stub
		if (a<=0)
		{
			return false;
		}
		
		for (int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				return false;
			}
		}
		return true;
	}
}

