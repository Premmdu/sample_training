package mypackage;
import java.util.*;
public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the year : ");
		int A = scanner.nextInt();
		if (((A%4==0) && (A%100!=0))||(A%400==0))
			System.out.println("Enter the year : " + A + "is a Leap Year");
		else
			System.out.println("Enter the year : "+ A + "is not a Leap Year");
			
			

	}

}
