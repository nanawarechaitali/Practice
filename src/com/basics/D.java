package com.basics;

import java.util.Scanner;

///  Write a Java program to find the number of days in a mont
public class D {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);


        int numberOfDaysInMonth=0;
        String MonthOfName = "Unknown";

        System.out.println("Input a month number");
        int month = input.nextInt();

        System.out.println("Input a year");
        int year = input.nextInt();

        switch(month){
            case 1:
                MonthOfName ="January";
                numberOfDaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "February";
                if((year % 400 ==0) ||(year % 4 == 0)&& (year % 100 != 0)){
                numberOfDaysInMonth = 29;
            }else {
                numberOfDaysInMonth = 28;

            }
            break;
            case 3:
                MonthOfName = "March";
                numberOfDaysInMonth = 31;
                break;
            case 4:
                MonthOfName = "April";
                numberOfDaysInMonth = 30;
                break;
            case 5:
                MonthOfName = "May";
                numberOfDaysInMonth = 31;
                break;
            case 6:
                MonthOfName = "Jun";
                numberOfDaysInMonth=30;
                break;
            case 7:
                MonthOfName = "July";
                numberOfDaysInMonth = 31;
                break;
            case 8:
                MonthOfName = " August";
                numberOfDaysInMonth  =31;
                break;
            case 9:
                MonthOfName = "September";
                numberOfDaysInMonth = 30;
                break;
            case 10:
                MonthOfName = "Octomber";
                numberOfDaysInMonth = 31;
                break;
            case 11:
                MonthOfName = "November";
                numberOfDaysInMonth = 30;
                break;
            case 12:
                MonthOfName = "December";
                numberOfDaysInMonth= 31;
                break;

        }
        System.out.println(MonthOfName +" " +year+ " has "+numberOfDaysInMonth+" day\n");


        }
    }

