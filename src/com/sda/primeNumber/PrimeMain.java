package com.sda.primeNumber;

import java.util.Scanner;

public class PrimeMain {

    public static void main (String[] args)
    {
        System.out.println("Type your number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Checker checker = new Checker();
        System.out.println("Is this number Prime: " + checker.isPrime(n));
        scanner.close();
    }
}
