package com.Controlstatements;

import java.util.Scanner;

public class BasicSwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        @SuppressWarnings("resource")
		Scanner input= new Scanner(System.in);
        System.out.println("Enter the case value");
        int a=input.nextInt();
        
        switch(a){
        case 1:
        	System.out.println("your value is 1");
        	break;
        	
        case 2:
        	System.out.println("Your value is 2");
        	
        case 3:
            System.out.println("your value 3");
            
        case 4:
        	System.out.println("your value is 3");
        	break;
        	
        	default:
        		System.out.println("your entered value not available");
        		
        }
                System.out.println("execution of swich is completed"+ "\n"+"Thank you");
        
	}

}
