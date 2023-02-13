package com.basics;

import java.util.Scanner;

//Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places.
public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first floating number");
        double x = sc.nextDouble();
        System.out.println("Input second floating number");
        double y = sc.nextDouble();

        x = Math.round(x*1000);
        x = x/1000;


        y = Math.round(y*1000);
        y = y/1000;


        if(x == y){
            System.out.println("They are the same upto 3 decimal points");
        }
        else{
            System.out.println("They are different");
        }

    }
}
