package com.basics;

import java.util.Scanner;

// Write a program in Java to display n terms of natural numbers and their sum
public class X {
    public static void main(String[] args) {
        int i,n,sum=0;{
            Scanner sc = new Scanner(System.in);
            System.out.println("Input number");
            n = sc.nextInt();
        }
        System.out.println("Input first n natural numbers are" +n);
        for(i=1;i<=n;i++){
            System.out.println(i);
            sum+=i;

        }
        System.out.println("The sum of natural number upto " +n+ "terms: "+sum);

    }
}
