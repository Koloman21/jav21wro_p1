package com.sda.powtorka;


import java.util.Scanner;


public class PowtorkaMain {

    public static void main(String[] args) {
        System.out.println("What do you want to draw?");
        System.out.println("Type number for:");
        System.out.println("1. Rectangle");
        System.out.println("2. Square");
        System.out.println("3. Triangle");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int sideA;
        int sideB;

        switch (number) {
            case 1:
                System.out.println("Instert first side");
                sideA = scanner.nextInt();

                System.out.println("Instert second side");
                sideB = scanner.nextInt();

                Rectangle rectangle = new Rectangle(sideA, sideB);
                rectangle.draw();

            /*case 2:
                System.out.println("Instert side length");
                int side = scanner.nextInt();
                Square square = new Square();
                square.draw();
                break;

            case 3:
                // ZROBIENIE TRÓJKĄTA
                System.out.println("Insert side a");

        }*/


        }
    }
}
