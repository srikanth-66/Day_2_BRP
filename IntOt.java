package com.homeprograms;

import java.util.Scanner;

public class IntOt 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values of a,b,c ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int firstequation=(a+b*c);
		System.out.println("(a+b*c) =="+firstequation);
		int secondequation=(a*b+c);
		System.out.println("(a*b+c0 == "+secondequation);
		int thirdequation=(c+a/b);
		System.out.println("(c+a/b) == "+thirdequation);
		int fourthequation=(a%b+c);
		System.out.println("(a%b+c) == "+fourthequation);

	}

}
