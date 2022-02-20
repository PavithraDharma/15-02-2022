//Program to print odd numbers between 1-100 and even numbers between 100-200 
package com.demo;
public class bothoddandeven{
	public static void main(String args[]){
		System.out.println("Odd numbers between 1-100 are= ");
		for(int i=1;i<=99;i++)
		{
			if(i%2 != 0)
			{
				System.out.println(i);
			}
		}
		System.out.println("Eve numbers between 100-200 are= ");
		for(int i=100;i<=200;i++)
		{
			if(i%2 == 0)
			{
				System.out.println(i);
			}
		}
	}
}
