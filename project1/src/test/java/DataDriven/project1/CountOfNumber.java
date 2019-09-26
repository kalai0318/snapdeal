package DataDriven.project1;

import java.util.Scanner;

public class CountOfNumber {
	public static void main(String[] args) {
		
		//using while loop
		int n,i=0;
		System.out.println("Enter a number");
		Scanner get=new Scanner(System.in);
		n=get.nextInt();
		while(n>0)
		{
		n=n/10;
		i++;
		}
		System.out.println("No of digits present: "+i);
		System.out.format("\n Number of Digits in a Given Number = %d", i);
		
		//using for loop
		int Number, Count=0;
		
	
		System.out.println("\n Please Enter any Number: ");
		Number = get.nextInt();
		
		for (Count = 0; Number > 0; Number = Number/10) {
			Count = Count + 1; 
		}
		System.out.format("\n Number of Digits in a Given Number = %d", Count);
		}

}
