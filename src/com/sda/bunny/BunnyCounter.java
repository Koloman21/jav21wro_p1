package com.sda.bunny;

import java.util.Scanner;

public class BunnyCounter {

    public static void main(String[] args) {
        System.out.println("Insert month number: ");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int bNop = 0;
        int bNo = 1;


        System.out.println(bunnyCounterRecurence(n, bNop, bNo));
    }


    public static int bunnyCounterRecurence(int n, int bNop, int bNo) {

        if (n > 1) {

            for (int i = 0; i < n; ++i) {
                int temp = bNo + bNop;
                bNop = bNo;
                bNo = temp;
            }
        }
        return bNop;
    }
}
