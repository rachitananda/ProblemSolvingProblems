package com.problem.solving.numbersytem;

import java.util.Scanner;

import com.problem.solving.BaseProblem;

public class BinaryDecimalConversion extends BaseProblem{

	@Override
	public void execute() {
		Scanner in = new Scanner(System.in);
		int testcases= in .nextInt();
		for(int i=0;i<testcases;i++) {
			//get input 
			long n=in .nextLong();
			convertToDecimal(n);
		}
		
//		convertDecimalToBinary(13);
	}

	private void convertToDecimal(long n) {
		
	  
	    int index=0;
	    long decimal=0;
		while(n>0) {
			 long rem=n%10;
			 System.out.println("rem"+rem+" pow index"+index); 
			 decimal+=((long) Math.pow(2, index))*rem;
			 index++;
			 n=n/10;//quotient
		}
		System.out.println("decimal "+decimal);
	}
	
	private void convertDecimalToBinary(int n) {
		int arr[] = new int[10]; 
		int i=0;
		while(n>0) {
			 int rem=n%2;
			 System.out.println("rem"+rem+" n"+n); 
			 arr[i++]=rem;
			 n=n/2;//quotient 
		}
		
		for(int j=i-1;j>=0;j--) {
			System.out.print(arr[j]);
		}
		
		
	}

}
