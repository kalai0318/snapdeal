package DataDriven.project1;

import java.util.Scanner;

public class Fibonaaci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int a=0,b=1,c;
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<=n;i++) {
			c=a+b;
			System.out.println(c);
			
			a=b;
			b=c;
			
		}
		
		
		
	}

}
