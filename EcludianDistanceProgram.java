package com.homeprograms;

import java.util.Scanner;

public class EcludianDistanceProgram {
	public static void main(String arg[])	
	{
		Scanner sc =new Scanner(System.in);
            int x1,x2,y1,y2;
	    double dis;
	    System.out.println("enter the values of x1,x2,y1,y2");
	    x1=sc.nextInt();
	    x2=sc.nextInt();
	    y1=sc.nextInt();
	    y2=sc.nextInt();
	    System.out.println();
	    dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));	 	    
            System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
	}


}
