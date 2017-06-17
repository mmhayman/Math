package com.company;
import java.util.Scanner;

public class Main {


    private static void start() {
        System.out.println();

        Scanner in = new Scanner(System.in);

        // Declare variables

        int userNum = 0; //user inputs
        int x1;
        int d;
        int sum = 0;

    }

    public static void main(String[] args) {
        start();
        Scanner in = new Scanner(System.in);

        int userNum;
        int x1;
        int d;
        int sum = 0;

        //Prompt user to enter a integer
        System.out.println("Please enter a number: ");
        userNum = in.nextInt();

        x1 = userNum;

        while (userNum >0)

        {
            d = userNum%10;
            sum= sum + (d*d*d);
            userNum = userNum/10;

        }


        if (x1 == sum) {
            System.out.println( "True! Your input: " + x1 + " , equals the sum of the cubes digits. "); // if input and sum are equal to each other: Print : true
        }
        else {
            System.out.println("False! Your input: " + x1 + " , does not equal the sum of the cubes digits."); // if input and sum are not equal to each other : Print : false

        }
    }


    }








