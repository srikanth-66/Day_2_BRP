package com.homeprograms;

import java.util.Scanner;

public class DoubleOt 
{
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the values of a,b,c ");
	double a=sc.nextDouble();
	double b=sc.nextDouble();
	double c=sc.nextDouble();
	double firstequation=(a+b*c);
	System.out.println("(a+b*c) =="+firstequation);
	double secondequation=(a*b+c);
	System.out.println("(a*b+c0 == "+secondequation);
	double thirdequation=(c+a/b);
	System.out.println("(c+a/b) == "+thirdequation);
	double fourthequation=(a%b+c);
	System.out.println("(a%b+c) == "+fourthequation);


}
}