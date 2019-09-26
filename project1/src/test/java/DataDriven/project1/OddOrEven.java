package DataDriven.project1;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Fravorite Number");
		int n = sc.nextInt();
		System.out.println(n);
		if(n/2==0)
		{
	System.out.println("It is prime");
	}
		else
		{
			System.out.println("It is odd");
		}

}
}