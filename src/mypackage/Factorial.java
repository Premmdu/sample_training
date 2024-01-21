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
//dinesh guided
	private static int fact(int c) {
		// TODO Auto-generated method stub
		if(c==1){
		return 1;
	}
		if(c<0)
		{
			System.out.println("Entered number is negative");
			return -1;
	}
		int B = fact(c-1)*c;
		return B;
		//testing priya

}
}

