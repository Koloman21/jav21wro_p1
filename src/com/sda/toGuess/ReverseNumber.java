package com.sda.toGuess;

import java.util.Random;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();

    int upperLimit = 100;
    int lowerLimit = 0;
    int theNumber;
        System.out.println("Select your number");
        int number = scanner.nextInt();
        theNumber = upperLimit - lowerLimit / 2;
    for (int i = 0; i < 5; ++i) {


        if (theNumber < number) {
            System.out.println("It is higher than " + theNumber);
            lowerLimit = theNumber;
            theNumber = lowerLimit + upperLimit / 2;
        }
        if (theNumber > number) {
            System.out.println("It is lower than " + theNumber);
            upperLimit = theNumber;
            theNumber = upperLimit / 2;
        }


    }
        System.out.println("The number: " + theNumber);
        System.out.println("Number: " + number);
    }

}