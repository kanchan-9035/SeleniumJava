package com.Controlstatements;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =1,count=0;
		System.out.println("Enter the number to be checked");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
				
			}
		}
		
		if(count==2)
		{
			System.out.println(n +" is prime number");
		}
		else {
			System.out.println(n +" is not prime number");
		}
		

	}

}
