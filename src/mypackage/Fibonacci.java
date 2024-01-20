package mypackage;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the number for Finonacci : ");
		int A = scanner.nextInt();
		int t1 = 0;
		int t2 = 1;
		System.out.println("Enetered fibonacci series is : " + A);
		while(t1<=A)
		{
			System.out.print(t1 + ",");
			int sum = t1 +t2;
			t1 = t2;
			t2 = sum;

	}

}
}
