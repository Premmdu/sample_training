package mypackage;

import java.util.Scanner;

public class reversestringwithoutinbuilt {

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
		char[] chararray = name.toCharArray();
		int left = 0;
		int right = chararray.length-1;
		while(left<right)
		{
			char temp =  chararray[left];
			chararray[left] = chararray[right];
			chararray[right] = temp;
			left++;
			right--;
		}
		return new String(chararray);
		
	}

	}


