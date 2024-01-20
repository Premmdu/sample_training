package mypackage;
import java.util.*;
public class swappwithoutthird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.println("Eneter the number for A : ");
		int A = scanner.nextInt();
		System.out.println("Eneter the number for B : ");
		int B = scanner.nextInt();
		A = A+B;//(A= 5, B=10, A+B = 15, A=15)
		B = A-B;//(A= 15, B=10, A-B = 5)
		A = A-B; //(A= 15, B=5, A-B = 5)
		System.out.println("Swapp of  A : " + A +"Swapp of  B : " + B);

	}

}




