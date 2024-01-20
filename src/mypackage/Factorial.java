package mypackage;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the number for Factorial : ");
		int A = scanner.nextInt();
		int factorial = fact(A);
		System.out.println("Factorial : " + factorial);

	}

	private static int fact(int a) {
		// TODO Auto-generated method stub
		if(a==1){
		return 1;
	}
		if(a<0)
		{
			System.out.println("Entered number is negative");
			return -1;
	}
		int B = fact(a-1)*a;
		return B;

}
}

