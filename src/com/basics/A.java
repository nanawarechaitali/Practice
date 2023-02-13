package com.basics;

import java.util.Scanner;

//Take three numbers from the user and print the greatest number.
public class A {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the first number:");
   int a = sc.nextInt();
   System.out.println("Enter the second number:");
   int b = sc.nextInt();
   System.out.println("Enter the third number:");
   int c = sc.nextInt();


   if(a>b)
    if(a>c)
     System.out.println("Given number is greatest" +a);

   if(b>a)
    if(b>c)
     System.out.println("Given number is greatest"+ b);

   if(c>a)
    if(c>b)
     System.out.println("Given number is greatest"+ c);


   }
    }





