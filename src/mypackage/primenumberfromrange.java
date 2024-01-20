package mypackage;

import java.util.Scanner;

public class primenumberfromrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, count;
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the number : ");
		int A = scanner.nextInt();
		int j=2;
		while(j<=A)
		{
			count = 0;
			i=1;
			while(i<=j)
			{
				if(j%i==0)
				{
					count ++;
					
				}
				i++;
			}
		
		if(count==2)
		{
			System.out.println(j + "  ");
		}
		j++;
		}
	}

}
