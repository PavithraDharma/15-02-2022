//Program using foreach loop
package com.demo;
public class Foreachstring{
public static void main(String args[]){
      String names[]={"abc","def","ghi"};
      System.out.println("Using foreach");
      for(String name : names)
      {
         System.out.println(name);
      }
      System.out.println();
      System.out.println("Using length method");
      for(int i=0 ; i<names.length; i++)
      {
         System.out.println(names[i]);
      }
  }
}
