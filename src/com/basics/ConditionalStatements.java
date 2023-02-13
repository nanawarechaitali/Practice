package com.basics;

import java.util.Scanner;

//Write a Java program to get a number from the user and print whether it is positive or negative.
public class ConditionalStatements {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int result = in.nextInt();

        if(result>0){
            System.out.println("Given number is positive");
        }else if(result==0){
            System.out.println("Given number is zero");
        }else{
            System.out.println("Given number is negative");
        }
    }


}
