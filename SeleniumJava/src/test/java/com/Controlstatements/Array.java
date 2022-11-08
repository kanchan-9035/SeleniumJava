package com.Controlstatements;


public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr=new int[6];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		arr[5]=80;
		
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		int[] prime= {10,20,45,13,14,18,19,47,50,4,5,6};
		for(int j=1;j<prime.length;j++)
		{
			System.out.println(prime[j]);
		}
				
	}

}
