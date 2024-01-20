package mypackage;
import java.util.*;
public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.println("Eneter the number for A : ");
		int A = scanner.nextInt();
		System.out.println("Eneter the number for B : ");
		int B = scanner.nextInt();
		int temp = A;
		A = B;
		B = temp;
		
		System.out.println("Swapp of  A : " + A +"Swapp of  B : " + B);
		

	}

}
