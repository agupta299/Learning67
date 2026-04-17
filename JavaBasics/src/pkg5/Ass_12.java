package pkg5;

import java.util.Scanner;

public class Ass_12 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter your number1");
		int num1 = s1.nextInt();
		
//		if(num1>0)
//		{
//			
//			System.out.println("numner is positive");
//	}
//		
//		else if (num1==0)
//		{System.out.println("num is Zero");
//
//}
//		else
//		{
//			System.out.println("num is negative");
//		}
		System.out.println(num1>0?"positive":num1<0?"Negative":"zero");
		System.out.println(num1%2==0?"even":"odd");
	}
}