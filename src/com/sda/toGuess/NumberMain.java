package com.sda.toGuess;

import java.util.Scanner;

public class NumberMain {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = (int) (Math.random()*100);


        for (int i = 0; i < 5; ++i) {
            System.out.println("Zgadnij liczbę");
            int a = scanner.nextInt();

            if (a < number)
                System.out.println("ZA MAŁA");

            if (a > number)
                System.out.println("ZA DUŻA");

            if (a == number){
                System.out.println("WYGRAŁEŚ");
                break;
            }


        }
    }
}
