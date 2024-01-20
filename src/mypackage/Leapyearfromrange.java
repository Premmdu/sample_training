package mypackage;
import java.util.*;
public class Leapyearfromrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the start year : ");
		int A = scanner.nextInt();
		System.out.println("Enter the Last year : ");
		int B = scanner.nextInt();
		if(A>B) {
			System.out.println("Invalid Input ");
		     scanner.close();
			return ;
		}
		System.out.println("Leap year within the range ");
		for (int i = A; i<=B;i++)
		{
			if (isleapyear(i))
				System.out.println(i);
		}
		System.out.println("Not a Leap year within the range ");
		for (int i = A; i<=B;i++)
		{
			if (!isleapyear(i))
				System.out.println(i);
		}
		
	}

	private static boolean isleapyear(int i) {
		// TODO Auto-generated method stub
		if (((i%4==0) && (i%100!=0))||(i%400==0)) {
			return true;
	}
		else
		{
		return false;
	}

	}
}
