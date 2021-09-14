package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yussef Abdelbary
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("What is your weight in pounds? ");
        Scanner sc = new Scanner(System.in);
        float weight = Float.parseFloat(sc.nextLine());
        System.out.println("What is your height in inches? ");
        float height = Float.parseFloat(sc.nextLine());
        float bmi = (weight/ (height * height))* 703;
        if(bmi<18.5){
            System.out.println("You are underweight");
        }else if(bmi > 18.5 && bmi <25){
            System.out.println("You are within the ideal weight range");
        }else{
            System.out.println("You are Overweight. You should see your doctor.");
        }

    }
}
