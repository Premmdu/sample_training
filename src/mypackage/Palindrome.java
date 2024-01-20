package mypackage;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the name : ");
		String name = scanner.nextLine();
		if (ispalindrom(name))
		{
		System.out.println(name + " is a Palindrome ");

	}
		else
		{
			System.out.println(name + " is not a Palindrome ");
}
}

	private static boolean ispalindrom(String name) {
		// TODO Auto-generated method stub
		int a =0;
		int b = name.length()-1;
				while (a<b) {
			if(name.charAt(a)!=name.charAt(b)) {
				
		return false;
			}
			a++;
			b--;
	}
				return true;
			
	}
}