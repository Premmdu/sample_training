package mypackage;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the String : ");
		String name = scanner.nextLine();
		String reversed = isreverse(name);
		
			System.out.println("Reversed string is : " + reversed);
		

	}

	private static String isreverse(String name) {
		// TODO Auto-generated method stub
		StringBuilder reversed = new StringBuilder();
		for (int i=name.length()-1;i>=0;i--)
		{
			reversed.append(name.charAt(i));
		}
		return reversed.toString();
	}

}
