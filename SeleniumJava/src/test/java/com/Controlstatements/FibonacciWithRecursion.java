package com.Controlstatements;

import java.util.Scanner;

public class FibonacciWithRecursion {

	static int n1=0,n2=1,n3=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciWithRecursion obj=new FibonacciWithRecursion();
		
        @SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        
		int count=input.nextInt();
		System.out.print(n1+","+n2);
		obj.printFibonacciSeries(count-2);
		// if method was static no need to create object and directly call method
	}
	
    void printFibonacciSeries(int count)
    {
    	if(count>0) {
    	n3=n1+n2;
    	n1=n2;
    	n2=n3;
    	System.out.print(","+n3);
    	printFibonacciSeries(count-1);
    	}
    	
    }
    
	/*
	 * static void printFibonacciSeries(int count) { if(count>0) { n3=n1+n2; n1=n2;
	 * n2=n3; System.out.print(","+n3); printFibonacciSeries(count-1); }
	 */
}
