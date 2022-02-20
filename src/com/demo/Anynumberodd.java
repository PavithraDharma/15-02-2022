//Print odd  numbers by getting user inputs(ex:start value=100,end value=200)
package com.demo;
import  java.util.Scanner;
public  class Anynumberodd{
public static void main(String args[]){
      int start; int last;
      System.out.print("Odd Numbers\n");
      Scanner obj=new Scanner(System.in);
      System.out.print("Enter start value=");
      start=obj.nextInt();
      System.out.print("\nEnter end value=");
      last=obj.nextInt();
      for (;start <=last;start++)
      {
          if(start%2!=0)
          {
              System.out.println(start);
          }
      }
  obj.close();
  }
}
